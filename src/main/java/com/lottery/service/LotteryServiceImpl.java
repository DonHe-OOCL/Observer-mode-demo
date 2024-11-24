package com.lottery.service;

import com.lottery.entity.LotteryResult;

import java.util.Date;

public class LotteryServiceImpl extends LotteryService{

    private CarTargetService carTargetService = new CarTargetService();

    @Override
    protected LotteryResult doDraw(String uId) {
        // lottery
        String lottery = carTargetService.lottery(uId);
        // return result
        return new LotteryResult(uId, lottery, new Date());;
    }
}
