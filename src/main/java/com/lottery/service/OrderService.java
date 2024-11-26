package com.lottery.service;

import com.lottery.entity.EventResult;
import com.lottery.event.EventManager;
import com.lottery.event.listener.BookingShipmentEventListener;
import com.lottery.event.listener.MessageEventListener;

public abstract class OrderService {

    private EventManager eventManager;

    public OrderService() {
        eventManager = new EventManager(EventManager.EventType.BookingShipment, EventManager.EventType.Message);
        eventManager.subscribe(EventManager.EventType.BookingShipment, new BookingShipmentEventListener());
        eventManager.subscribe(EventManager.EventType.Message, new MessageEventListener());
    }

    public EventResult order(String uId) {
        // order
        EventResult orderResult = doOrder(uId);
        // message
        eventManager.notify(EventManager.EventType.Message, orderResult);
        // booking a shipment
        eventManager.notify(EventManager.EventType.BookingShipment, orderResult);
        return orderResult;
    }

    protected abstract EventResult doOrder(String uId);
}
