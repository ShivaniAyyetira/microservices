package com.kaushik.microservices.limitsservice.bean;

import lombok.Data;

@Data
public class LimitConfig {
    private int maximum;
    private int minimum;

    public LimitConfig(int maximum, int minimum) {
        super();
        this.maximum =maximum;
        this.minimum = minimum;
    }
}
