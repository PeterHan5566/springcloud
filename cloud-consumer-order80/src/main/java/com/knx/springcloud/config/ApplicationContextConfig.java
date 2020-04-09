package com.knx.springcloud.config;

import com.knx.myrule.RandomRule_Peter;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean
    //@LoadBalanced
    public RestTemplate getRestTemplate() {

        return new RestTemplate();

    }
//    @Bean
//    public IRule myRule() {
//        // new RandomRule();//达到的目的就是随机选择默认的轮训RandomRule
//        return new RandomRule_Peter();//活着的时候就是轮询
//    }
}
