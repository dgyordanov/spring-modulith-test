package edu.test.spring_modulith_test.delivery.infrastructure;

import edu.test.spring_modulith_test.delivery.application.DeliveryService;
import edu.test.spring_modulith_test.orders.domain.OrderPlacedEvent;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Service
class OrderEventListener {

    private final DeliveryService deliveryService;

    OrderEventListener(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @ApplicationModuleListener
    void on(OrderPlacedEvent event) {
        System.out.println("OrderPlacedEvent consumed: " + event);
        deliveryService.createDelivery(event.orderId());
    }

}
