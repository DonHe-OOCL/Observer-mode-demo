package com.lottery;

import com.alibaba.fastjson.JSON;
import com.lottery.entity.LotteryResult;
import com.lottery.service.LotteryService;
import com.lottery.service.LotteryServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void show_result() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("2765789109877");
        logger.info("测试结果：{}", JSON.toJSONString(result));
    }
}
