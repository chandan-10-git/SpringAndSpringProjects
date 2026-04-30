package com.ck.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ck.Entity.SensorData;

public interface SensorDataRepo extends JpaRepository<SensorData, Long>{

	List<SensorData> findByLocationCode(String locationCode);

}
