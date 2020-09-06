package com.hans.cloud.order.controller;

import com.hans.cloud.order.entities.CommonResult;
import com.hans.cloud.order.entities.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: hans
 * @Date: 2020/9/6 19:59
 */
@RestController
@RequestMapping("/consummer")
public class OrderController {

    private Logger log = LoggerFactory.getLogger(OrderController.class);

    private static final String PAYMENT_URL = "http://localhost:8001/payment";
    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/payment/create")
    public CommonResult create(Payment payment) {
        log.info("order create {}", payment);
        return restTemplate.postForObject(PAYMENT_URL + "/create", payment, CommonResult.class);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPayment(@PathVariable Long id){
        log.info("order getPayment id {}", id);
        return restTemplate.getForObject(PAYMENT_URL+"/get/"+id, CommonResult.class);
    }


}
