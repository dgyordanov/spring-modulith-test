package edu.test.spring_modulith_test.orders.domain;

import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<Order, Integer> {
}
