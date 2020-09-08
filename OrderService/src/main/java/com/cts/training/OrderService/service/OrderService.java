package com.cts.training.OrderService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.OrderService.DTO.SaveOrderDTO;
import com.cts.training.OrderService.model.OrderDetails;
import com.cts.training.OrderService.repository.OrderDetailsRepository;

@Service
public class OrderService {
	@Autowired
	private OrderDetailsRepository orderdetailsRepo;
		
	public OrderDetails saveOrder(SaveOrderDTO saveorderDTO) {
		
		OrderDetails data=new OrderDetails();
		data.setModelId(saveorderDTO.getModelId());
		data.setSeriesId(saveorderDTO.getSeriesId());
		data.setPrice(saveorderDTO.getPrice());
		data.setOrdercoloraccessories(saveorderDTO.getOrdercoloraccessories());
		return this.orderdetailsRepo.save(data);
	}
//	public OrderColorAccessory saveOrderColorAccessory(OrderColorDTO ordercolorDto) {
//		OrderColorAccessory dataAccessory=new OrderColorAccessory();
//		data.set
//	}

	public List<OrderDetails> getAllOrders() {
		// TODO Auto-generated method stub
		return orderdetailsRepo.findAll();
	}

}
