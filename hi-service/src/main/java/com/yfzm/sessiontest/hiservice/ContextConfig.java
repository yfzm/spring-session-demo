package com.yfzm.sessiontest.hiservice;

import com.yfzm.util.utildemo.AutoTest;
import com.yfzm.util.utildemo.WrapBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfig {

    @Bean
    public AutoTest autoTest() {
        return new AutoTest();
    }

    @Bean
    @ConfigurationProperties("r")
    public WrapBean wrapBean() {
        return new WrapBean();
    }
}
