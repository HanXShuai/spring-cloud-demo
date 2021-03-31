package com.hans.cloud.order.payment04.service;

import coom.hans.cloud.common.entities.Payment;

/**
 * @Author: hans
 * @Date: 2021/3/22 21:09
 */
public interface IPaymentService {
    int createPayment(Payment payment);

    Payment queryPaymentById(Long id);
}
