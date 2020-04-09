package com.knx.springcloud.services.impl;

import com.knx.springcloud.dao.PaymentDao;
import com.knx.springcloud.entities.Payment;
import com.knx.springcloud.services.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }


}
