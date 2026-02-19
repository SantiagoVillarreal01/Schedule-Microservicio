package com.fitflow.scheduler.logic.network;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fitflow.scheduler.data.entities.apis.membership.MembershipApi;


@FeignClient(name = "membership-service")
public interface BookingMembershipInterface {
    
    
    @GetMapping("/api/v1/membership/{id}")
    MembershipApi findById(@PathVariable("id") String id);
    
}