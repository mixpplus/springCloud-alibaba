package com.ingin.payment.service.impl;

import com.ingin.common.entity.Payment;
import com.ingin.payment.dao.PaymentDao;
import com.ingin.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-07 17:50
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
//        Map<String, Object> paymentById = paymentDao.getPaymentById(id);
    }
}
