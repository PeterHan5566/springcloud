package com.knx.springcloud.controller;

import com.knx.springcloud.entities.CommonResult;
import com.knx.springcloud.entities.Payment;
import com.knx.springcloud.services.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class PaymentGateController {

    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping(value = "/paymentgate/lb")
    public String getPaymentLB() {
        return "PaymentGateController:"+serverPort;
    }


}
