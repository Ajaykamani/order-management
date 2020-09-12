package com.cts.training.OrderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.training.OrderService.model.OrderDetails;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
	
	@Query(value="select * from order_details where userid=1",nativeQuery = true)
	OrderDetails getAllOrders();

}
