package com.hans.cloud.myrule;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: hans
 * @Date: 2021/3/14 18:45
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        /**
         * com.netflix.loadbalancer.RoundRobinRule 轮询
         * com.netflix.loadbalancer.RandomRule 随机
         * com.netflix.loadbalancer.RetryRule 先按照 RoundRobinRule 策略获取服务，
         *    如果获取服务失败则在指定时间内进行重试，获取可用的服务
         * com.netflix.loadbalancer.WeightedResponseTimeRule 对 RoundRobinrule 的扩展，
         *   响应速度快的实力选择权重大，越容易选择
         * com.netflix.loadbalancer.BestAvailableRule 会先过滤掉由于多次访问故障处于断路跳闸状
         *  态的服务，然后选择一个并发量小的服务
         * com.netflix.loadbalancer.AvailabilityFilteringRule 先过滤故障实例，再选择并发小的实例
         * com.netflix.loadbalancer.ZoneAvoidanceRule 默认规则，复合判断server 所在区域的性能和
         *  server 的可用性选择服务
         */

        return new RandomRule();
    }
}
