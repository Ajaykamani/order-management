package com.cts.training.OrderService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.training.OrderService.DTO.SaveOrderDTO;
import com.cts.training.OrderService.model.OrderAccessory;
import com.cts.training.OrderService.model.OrderColor;
import com.cts.training.OrderService.model.OrderDetails;
import com.cts.training.OrderService.repository.OrderAccessoryRepo;
import com.cts.training.OrderService.repository.OrderColorRepo;
import com.cts.training.OrderService.repository.OrderDetailsRepository;

@Service
public class OrderService {
	@Autowired
	private OrderDetailsRepository orderDetailsRepo;	
	@Autowired
	private OrderColorRepo orderColorRepo;
	@Autowired
	private OrderAccessoryRepo orderAccessoryRepo;
	
	

	public void placeOrder(@RequestBody SaveOrderDTO saveorderDTO) {
		OrderDetails od = new OrderDetails();
		od.setUserId(saveorderDTO.getUserId());
		od.setSeriesId(saveorderDTO.getSeriesId());
		od.setSeriesName(saveorderDTO.getSeriesName());
		od.setModelId(saveorderDTO.getModelId());
		od.setModelName(saveorderDTO.getModelName());
		od.setTotalPrice(saveorderDTO.getTotalPrice());
		od.setOrderAccessory(saveorderDTO.getAccessoriesSelected());
		od.setOrderColor(saveorderDTO.getColorsSelected());
		orderDetailsRepo.save(od);
	}

	public SaveOrderDTO getAllOrders() {
		OrderDetails od = orderDetailsRepo.getAllOrders();
		List<OrderColor> ocd = orderColorRepo.findAll();
		List<OrderAccessory> oad = orderAccessoryRepo.findAll();
		SaveOrderDTO sendData = new SaveOrderDTO();		
		sendData.setUserId(od.getUserId());
		sendData.setSeriesId(od.getSeriesId());
		sendData.setSeriesName(od.getSeriesName());
		sendData.setModelId(od.getModelId());
		sendData.setModelName(od.getModelName());
		sendData.setTotalPrice(od.getTotalPrice());
		sendData.setAccessoriesSelected(od.getOrderAccessory());
		sendData.setColorsSelected(od.getOrderColor());	
		return sendData;

	}
}