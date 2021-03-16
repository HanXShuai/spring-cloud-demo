package com.hans.cloud.order.payment.service.impl;

import com.hans.cloud.order.payment.dao.IPaymenttDao;
import com.hans.cloud.order.payment.service.IPaymentService;
import coom.hans.cloud.common.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: hans
 * @Date: 2020/9/6 14:50
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    private IPaymenttDao paymenttDao;

    public int createPayment(Payment payment) {
        return paymenttDao.createPayment(payment);
    }

    public Payment queryPaymentById(Long id) {
        return paymenttDao.queryPaymentById(id);
    }
}
