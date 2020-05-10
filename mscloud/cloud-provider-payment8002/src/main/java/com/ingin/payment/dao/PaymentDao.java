package com.ingin.payment.dao;

import com.ingin.common.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-07 17:33
 */
@Mapper
@Repository
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
