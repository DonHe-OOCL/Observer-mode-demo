package com.lottery.service;

import com.lottery.entity.LotteryResult;
import com.lottery.event.EventManager;
import com.lottery.event.listener.MQEventListener;
import com.lottery.event.listener.MessageEventListener;

public abstract class LotteryService {

    private EventManager eventManager;

    public LotteryService() {
        eventManager = new EventManager(EventManager.EventType.MQ, EventManager.EventType.Message);
        eventManager.subscribe(EventManager.EventType.MQ, new MQEventListener());
        eventManager.subscribe(EventManager.EventType.Message, new MessageEventListener());
    }

    public LotteryResult draw(String uId) {
        LotteryResult lotteryResult = doDraw(uId);
        // message
        eventManager.notify(EventManager.EventType.Message, lotteryResult);
        // MQ
        eventManager.notify(EventManager.EventType.MQ, lotteryResult);
        return lotteryResult;
    }

    protected abstract LotteryResult doDraw(String uId);
}
