package com.liufei.service;

import com.liufei.bean.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPayment(@Param("id") Long id);
}
