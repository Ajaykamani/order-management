package com.cts.training.OrderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.OrderService.model.OrderAccessory;

public interface OrderAccessoryRepo extends JpaRepository<OrderAccessory, Long> {

}
