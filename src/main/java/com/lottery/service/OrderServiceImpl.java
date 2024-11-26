package com.lottery.service;

import com.lottery.entity.EventResult;

import java.util.Date;

public class OrderServiceImpl extends OrderService {

    @Override
    protected EventResult doOrder(String uId) {
        String resultMsg = "订单 ".concat(uId).concat(" 下单成功");
        return new EventResult(uId, resultMsg, new Date());
    }
}
