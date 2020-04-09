package com.knx.myrule;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

public class MySelfRule {
    /**
     * 自定义顺序
     * @return
     */
    @Bean
    public IRule myRule() {
        // new RandomRule();//达到的目的就是随机选择默认的轮训RandomRule
        return new BestAvailableRule();//活着的时候就是轮询 Robbon默认是轮询
    }


}
