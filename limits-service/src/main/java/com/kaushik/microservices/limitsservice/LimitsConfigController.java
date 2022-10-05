package com.kaushik.microservices.limitsservice;

import com.kaushik.microservices.limitsservice.bean.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigController {
    @Autowired
    private Configuration configuration;

    
    @GetMapping("/limits")
    public LimitConfig retriveLimits() {
        return new LimitConfig(configuration.getMaximum(), configuration.getMinimum());
    }
}
