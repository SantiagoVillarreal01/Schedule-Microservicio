package com.fitflow.scheduler.logic.network;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fitflow.scheduler.data.entities.apis.metrics.MetricsApi;


@FeignClient(name = "metrics-service")
public interface BookingMetricsInterface {
    
    @GetMapping("/api/v1/metrics/user/{userId}")
    MetricsApi findById(@PathVariable("userId") String id);
    
}