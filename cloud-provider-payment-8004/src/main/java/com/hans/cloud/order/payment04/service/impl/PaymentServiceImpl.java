package com.hans.cloud.order.payment04.service.impl;

import com.hans.cloud.order.payment04.dao.IPaymenttDao;
import com.hans.cloud.order.payment04.service.IPaymentService;
import coom.hans.cloud.common.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: hans
 * @Date: 2021/3/22 21:08
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
