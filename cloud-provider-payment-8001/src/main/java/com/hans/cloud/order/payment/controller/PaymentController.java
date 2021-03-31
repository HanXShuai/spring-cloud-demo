package com.hans.cloud.order.payment.controller;

import com.hans.cloud.order.payment.service.IPaymentService;
import coom.hans.cloud.common.entities.CommonResult;
import coom.hans.cloud.common.entities.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * @Author: hans
 * @Date: 2020/9/6 14:55
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @PostMapping("/create")
    public CommonResult createPayment(Payment payment) {
        int result = paymentService.createPayment(payment);
        if (result > 0) {
            return new CommonResult(200, "insert success", result);
        } else {
            return new CommonResult(500, "insert fail", null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult queryPaymentById(@PathVariable Long id) {
        Payment payment = paymentService.queryPaymentById(id);
        if (payment != null) {
            return new CommonResult(200, "insert success", payment);
        } else {
            return new CommonResult(500, "insert fail", null);
        }
    }

    @GetMapping("/lb")
    public String getPort(){
        return port;
    }

    @GetMapping("/timeout")
    public String paymentTimeout(){
//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return port;
    }
}
