package com.liufei.service;

import org.springframework.stereotype.Component;

@Component
public class PaymenyHystrixImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_Ok(Integer id) {
        return "PaymentInfo Fail";
    }

    @Override
    public String paymentInfo_Ok2(Integer id) {
        return "PaymentInfo_TimeOut";
    }
}
