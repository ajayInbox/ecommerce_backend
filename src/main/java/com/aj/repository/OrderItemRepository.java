package com.aj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aj.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
