package com.liufei;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class OrderConsul8088 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsul8088.class,args);
    }
}
