package com.hans.cloud.order.paymrnt.service;

import com.hans.cloud.order.paymrnt.entities.Payment;

/**
 * @Author: hans
 * @Date: 2020/9/6 14:48
 */
public interface IPaymentService {
    int createPayment(Payment payment);

    Payment queryPaymentById(Long id);
}
