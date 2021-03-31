package com.hans.cloud.feign.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: hans
 * @Date: 2021/3/22 22:06
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignOrderApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignOrderApplication80.class, args);
    }
}
