package com.cts.training.OrderService.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.OrderService.model.OrderColor;
@Repository
public interface OrderColorRepo extends JpaRepository<OrderColor, Long> {


}
