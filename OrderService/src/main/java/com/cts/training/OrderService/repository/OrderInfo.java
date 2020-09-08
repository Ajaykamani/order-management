package com.cts.training.OrderService.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.OrderService.model.OrderColorAccessory;
@Repository
public interface OrderInfo extends JpaRepository<OrderColorAccessory, Long> {


}
