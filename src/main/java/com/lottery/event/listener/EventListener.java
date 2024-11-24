package com.lottery.event.listener;

import com.lottery.entity.LotteryResult;

public interface EventListener {

    void doEvent(LotteryResult result);
}
