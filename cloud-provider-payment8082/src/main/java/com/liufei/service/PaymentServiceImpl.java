package com.liufei.service;

import com.liufei.bean.Payment;
import com.liufei.dao.PaymentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPayment(Long id) {
        return paymentDao.getPayment(id);
    }
}
