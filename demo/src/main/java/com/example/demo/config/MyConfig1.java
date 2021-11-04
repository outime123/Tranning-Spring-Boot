package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:config.properties")
public class MyConfig1 {
    @Value("${spring.datasource.url}")
    private String url;
    @Autowired
    private Environment environment;

    public void displayEnv(){
        System.out.println(environment.getProperty("spring.datasource.url"));
    }
}
