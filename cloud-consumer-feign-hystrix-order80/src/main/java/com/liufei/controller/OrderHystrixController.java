package com.liufei.controller;

import com.liufei.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderHystrixController {
    @Autowired
    PaymentHystrixService paymentHystrixService;
    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_Ok(@PathVariable("id") Integer id){
        String s = paymentHystrixService.paymentInfo_Ok(id);
        return s;
    }
    @GetMapping("/consumer/payment_timeout/hystrix/ok/{id}")
    public String paymentInfo_timeout(@PathVariable("id") Integer id){
        String s = paymentHystrixService.paymentInfo_Ok2(id);
        return s;
    }



}
