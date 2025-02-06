package edu.test.spring_modulith_test.orders.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Set;

@Table("orders")
public record Order(@Id Integer id, Set<LineItem> lineItems) {

    @Table("order_items")
    public record LineItem(@Id Integer id, Integer productId, Integer quantity) {}

}


