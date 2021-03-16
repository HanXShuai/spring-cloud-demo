package com.hans.cloud.order.payment.service;


import coom.hans.cloud.common.entities.Payment;

/**
 * @Author: hans
 * @Date: 2020/9/6 14:48
 */
public interface IPaymentService {
    int createPayment(Payment payment);

    Payment queryPaymentById(Long id);
}
