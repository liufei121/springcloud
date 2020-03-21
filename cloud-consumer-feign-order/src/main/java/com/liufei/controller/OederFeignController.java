package com.liufei.controller;

import com.liufei.bean.CommonResult;
import com.liufei.bean.Payment;
import com.liufei.service.Paymentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OederFeignController {

    @Autowired
    private Paymentservice paymentservice;
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
            return paymentservice.getPayment(id);
    }

}
