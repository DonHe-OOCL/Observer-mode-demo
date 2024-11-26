package com.lottery;

import com.alibaba.fastjson.JSON;
import com.lottery.entity.EventResult;
import com.lottery.service.OrderService;
import com.lottery.service.OrderServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void show_result() {
        OrderService lotteryService = new OrderServiceImpl();
        EventResult result = lotteryService.order("2765789109877");
        logger.info("测试结果：{}", JSON.toJSONString(result));
    }
}
