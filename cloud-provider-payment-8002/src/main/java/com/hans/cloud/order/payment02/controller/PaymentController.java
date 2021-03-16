package com.hans.cloud.order.payment02.controller;

import com.hans.cloud.order.payment02.service.IPaymentService;
import coom.hans.cloud.common.entities.CommonResult;
import coom.hans.cloud.common.entities.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: hans
 * @Date: 2020/9/6 14:55
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    private Logger logger = LoggerFactory.getLogger(PaymentController.class);
    @Autowired
    private IPaymentService paymentService;

    @PostMapping("/create")
    public CommonResult createPayment(Payment payment) {
        int result = paymentService.createPayment(payment);
        logger.info("create result {}", result);
        if (result > 0) {
            return new CommonResult(200, "insert success", result);
        } else {
            return new CommonResult(500, "insert fail", null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult queryPaymentById(@PathVariable Long id) {
        Payment payment = paymentService.queryPaymentById(id);
        logger.warn("query result {}", payment);
        if (payment != null) {
            return new CommonResult(200, "insert success", payment);
        } else {
            return new CommonResult(500, "insert fail", null);
        }
    }
}
