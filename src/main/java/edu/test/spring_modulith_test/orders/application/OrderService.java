package edu.test.spring_modulith_test.orders.application;

import edu.test.spring_modulith_test.orders.domain.Order;
import edu.test.spring_modulith_test.orders.domain.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void placeOrder(Order order) {
        var savedOrder = orderRepository.save(order);
        System.out.println("Saved order: " + savedOrder);
    }

}
