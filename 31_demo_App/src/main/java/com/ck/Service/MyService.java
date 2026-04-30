package com.ck.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ck.Entity.SensorData;
import com.ck.repo.SensorDataRepo;

@Service
public class MyService {

   
	

	    @Autowired
	    private SensorDataRepo repository;

       // To Reduce No Of DB Call Using DB
	    
	    @Cacheable(value = "runoffReports", key = "#locationCode")
	    public String calculateRunoffReport(String locationCode) {
	        
	        // 1. Fetch data from DB
	        List<SensorData> data = repository.findByLocationCode(locationCode);
	        
	        // 2.Business Logic 
	        
	        double totalRainfall = data.stream().mapToDouble(SensorData::getRainfallMm).sum();
	        double runoffEstimate = totalRainfall * 0.35; 
	        
	        return "Total Runoff for " + locationCode + " is: " + runoffEstimate + " mm";
	    }

	    public void saveSensorData(SensorData data) {
	        // Ye data Kafka se aane ke baad DB mein save karne ke liye
	        repository.save(data);
	    }
	}

