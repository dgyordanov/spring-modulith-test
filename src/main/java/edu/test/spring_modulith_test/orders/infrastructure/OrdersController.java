package edu.test.spring_modulith_test.orders.infrastructure;

import edu.test.spring_modulith_test.orders.application.OrderService;
import edu.test.spring_modulith_test.orders.domain.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    private final OrderService orderService;

    public OrdersController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    void place(@RequestBody Order order) {
        orderService.placeOrder(order);
    }
}
