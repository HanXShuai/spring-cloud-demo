package com.hans.cloud.feign.order.controller;

import com.hans.cloud.feign.order.service.PaymentFeginService;
import coom.hans.cloud.common.entities.CommonResult;
import coom.hans.cloud.common.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: hans
 * @Date: 2021/3/24 21:37
 */
@RestController
public class OrderController {

    @Resource
    private PaymentFeginService paymentFeginService;

    @PostMapping("/consummer/payment/create")
    public CommonResult createPayment(Payment payment) {
        return paymentFeginService.createPayment(payment);
    }

    @GetMapping("/consummer/payment/get/{id}")
    public CommonResult queryPaymentById(@PathVariable Long id) {
        return paymentFeginService.queryPaymentById(id);
    }

    @GetMapping("/consummer/payment/timeout")
    public String paymentTimeout(){
        return paymentFeginService.paymentTimeout();
    }

}
