package com.hans.cloud.order;

import com.hans.cloud.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: hans
 * @Date: 2020/9/6 14:41
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "PROVIDER-PAYMENT", configuration = MySelfRule.class)
public class OrderApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication80.class, args);
    }
}
