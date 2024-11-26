package com.lottery.event.listener;

import com.lottery.entity.EventResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BookingShipmentEventListener implements EventListener {

    private final Logger logger = LoggerFactory.getLogger(BookingShipmentEventListener.class);

    @Override
    public void doEvent(EventResult result) {
        String shipmentId = generateShipmentId();
        logger.info("订单 {} 订舱成功(BookingShipment)：{}", result.getUId(), shipmentId);
    }

    private String generateShipmentId() {
        return "OOCL-894165498165";
    }
}
