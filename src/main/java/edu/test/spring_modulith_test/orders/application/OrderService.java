package edu.test.spring_modulith_test.orders.application;

import edu.test.spring_modulith_test.orders.domain.Order;
import edu.test.spring_modulith_test.orders.domain.OrderPlacedEvent;
import edu.test.spring_modulith_test.orders.domain.OrderRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderService {

    private final OrderRepository orderRepository;
    private final ApplicationEventPublisher eventPublisher;

    public OrderService(OrderRepository orderRepository, ApplicationEventPublisher eventPublisher) {
        this.orderRepository = orderRepository;
        this.eventPublisher = eventPublisher;
    }

    public void placeOrder(Order order) {
        var savedOrder = orderRepository.save(order);
        System.out.println("Saved order: " + savedOrder);

        OrderPlacedEvent orderPlacedEvent = new OrderPlacedEvent(savedOrder.id());
        eventPublisher.publishEvent(orderPlacedEvent);
        System.out.println("OrderPlacedEvent sent: " + orderPlacedEvent);
    }

}
