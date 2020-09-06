package com.hans.cloud.order.paymrnt.dao;

import com.hans.cloud.order.paymrnt.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: hans
 * @Date: 2020/9/6 14:51
 */
@Mapper
public interface IPaymenttDao {

    int createPayment(Payment payment);

    Payment queryPaymentById( Long id);
}
