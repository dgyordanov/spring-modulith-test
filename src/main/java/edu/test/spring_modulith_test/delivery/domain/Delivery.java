package edu.test.spring_modulith_test.delivery.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("deliveries")
public record Delivery(@Id Integer id, Integer orderId) {
    public Delivery(Integer orderId) {
        this(null, orderId);
    }
}
