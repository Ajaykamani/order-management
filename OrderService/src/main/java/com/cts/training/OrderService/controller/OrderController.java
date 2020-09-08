package com.cts.training.OrderService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.OrderService.DTO.SaveOrderDTO;
import com.cts.training.OrderService.model.OrderDetails;
import com.cts.training.OrderService.service.OrderService;

import io.swagger.annotations.Api;
@Api
@RestController
public class OrderController {
	@Autowired
	private	OrderService orderService;
	@PostMapping("/saveorder")
	public void placeOrder(@RequestBody SaveOrderDTO saveOrderDTO)  {
		orderService.saveOrder(saveOrderDTO);		
	}
	
	@GetMapping("allorders")
	public List<OrderDetails> getAllOrders() {
		return orderService.getAllOrders();
	}
	
	

}
