package com.hans.cloud.feign.order.service;

import coom.hans.cloud.common.entities.CommonResult;
import coom.hans.cloud.common.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author: hans
 * @Date: 2021/3/24 21:55
 */
@Component
@FeignClient(name = "PROVIDER-PAYMENT")
public interface PaymentFeginService {

    @PostMapping("/payment/create")
    CommonResult createPayment(Payment payment);

    @GetMapping("/payment/get/{id}")
    CommonResult queryPaymentById(@PathVariable(name = "id",required = false) Long id);

    @GetMapping("/payment/timeout")
    public String paymentTimeout();
}
