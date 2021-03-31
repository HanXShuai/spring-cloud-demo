package com.hans.cloud.order.controller;

import com.hans.cloud.order.lb.LoadBalance;
import coom.hans.cloud.common.entities.CommonResult;
import coom.hans.cloud.common.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @Author: hans
 * @Date: 2020/9/6 19:59
 */
@RestController
@RequestMapping("/consummer")
@Slf4j
public class OrderController {

    private static final String PAYMENT_URL = "http://PROVIDER-PAYMENT/payment";
    @Resource
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalance loadBalance;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult create(Payment payment) {
        log.info("order create {}", payment);
        return restTemplate.postForObject(PAYMENT_URL + "/create", payment, CommonResult.class);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPayment(@PathVariable Long id) {
        log.info("order getPayment id {}", id);
        return restTemplate.getForObject(PAYMENT_URL + "/get/" + id, CommonResult.class);
    }

    @GetMapping("/payment/lb")
    public String getLoadBalance() {
        List<ServiceInstance> instances = discoveryClient.getInstances("PROVIDER-PAYMENT");
        if (instances == null || instances.size() <= 0) {
            log.info("instances is null");
            return null;
        }
        ServiceInstance serviceInstance = loadBalance.instance(instances);
        URI uri = serviceInstance.getUri();
        log.info("uri : {} ", uri);
        return restTemplate.getForObject(uri + "/payment/lb", String.class);
    }

}
