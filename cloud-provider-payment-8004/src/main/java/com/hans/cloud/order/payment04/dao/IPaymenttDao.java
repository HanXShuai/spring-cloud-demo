package com.hans.cloud.order.payment04.dao;

import coom.hans.cloud.common.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: hans
 * @Date: 2021/3/22 21:10
 */
@Mapper
public interface IPaymenttDao {
    int createPayment(Payment payment);

    Payment queryPaymentById(Long id);
}
