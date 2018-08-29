package com.yfzm.util.utildemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WrapConfig {

    @Bean("WrapBean")
//    @ConfigurationProperties("r")
    public WrapBean wrapBean() {
        return new WrapBean();
    }

}
