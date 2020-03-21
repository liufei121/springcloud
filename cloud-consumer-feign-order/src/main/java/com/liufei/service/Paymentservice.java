package com.liufei.service;

import com.liufei.bean.CommonResult;
import com.liufei.bean.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface Paymentservice {
    @GetMapping("/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id);
}
