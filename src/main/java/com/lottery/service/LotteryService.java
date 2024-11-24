package com.lottery.service;

import com.lottery.entity.LotteryResult;

public abstract class LotteryService {

    public LotteryResult draw(String uId) {
        LotteryResult lotteryResult = doDraw(uId);

        // message

        // MQ

        return lotteryResult;
    }

    protected abstract LotteryResult doDraw(String uId);
}
