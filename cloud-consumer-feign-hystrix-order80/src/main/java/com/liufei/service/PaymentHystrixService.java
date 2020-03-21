package com.liufei.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "hystrix-provider-8001",fallback = PaymenyHystrixImpl.class)
public interface PaymentHystrixService {

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_Ok(@PathVariable("id") Integer id);

    @GetMapping("/payment_timeout/hystrix/ok/{id}")
    public String paymentInfo_Ok2(@PathVariable("id") Integer id);

}
