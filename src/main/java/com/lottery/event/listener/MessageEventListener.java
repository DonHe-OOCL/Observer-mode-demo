package com.lottery.event.listener;

import com.lottery.entity.EventResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MessageEventListener implements EventListener{

    private final Logger logger = LoggerFactory.getLogger(MessageEventListener.class);

    @Override
    public void doEvent(EventResult result) {
        logger.info("给用户发送短信通知(短信)：{}", result.getMsg());
    }
}
