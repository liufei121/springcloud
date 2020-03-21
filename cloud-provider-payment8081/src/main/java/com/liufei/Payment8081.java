package com.liufei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Payment8081 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8081.class,args);
    }
}
