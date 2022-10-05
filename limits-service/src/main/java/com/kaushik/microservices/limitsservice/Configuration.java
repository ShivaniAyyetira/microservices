package com.kaushik.microservices.limitsservice;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties("limits-service")
public class Configuration {
    private int dummy;
    private int maximum;
    private int minimum;

}
