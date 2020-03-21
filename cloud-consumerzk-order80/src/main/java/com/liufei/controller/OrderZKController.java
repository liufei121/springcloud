package com.liufei.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderZKController {

    private static final String url = "http://cloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/consumer/payment/zk")
    public String orderPayment(){
        String forObject = restTemplate.getForObject(url + "/payment/zk", String.class);
        return forObject;
    }
}
