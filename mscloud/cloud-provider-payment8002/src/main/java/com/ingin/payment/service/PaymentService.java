package com.ingin.payment.service;

import com.ingin.common.entity.Payment;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-07 17:49
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);
}
