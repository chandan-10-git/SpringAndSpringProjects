package com.ck.RestContoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ck.Entity.SensorData;
import com.ck.Service.MyService;

@RestController
@RequestMapping("/api/v1/hydrology")
public class MyRestController {

    @Autowired
    private MyService myService;

    // GET Request: Dashboard par report dikhane ke liye (Ye Redis use karega)
    
    @GetMapping("/report/{locationCode}")
    public String getRunoffReport(@PathVariable String locationCode) {
        return myService.calculateRunoffReport(locationCode);
    }

    // POST Request: Naya data aane par (Real world mein ye Kafka se aayega)
    
    @PostMapping("/telemetry")
    public String ingestData(@RequestBody SensorData data) {
        myService.saveSensorData(data);
        return "Data Saved Successfully";
    }
}

