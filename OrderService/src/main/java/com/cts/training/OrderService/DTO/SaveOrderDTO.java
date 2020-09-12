package com.cts.training.OrderService.DTO;

import java.util.List;

import com.cts.training.OrderService.model.OrderAccessory;
import com.cts.training.OrderService.model.OrderColor;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SaveOrderDTO {
	
	private long userId;
	private long seriesId;
	private String seriesName;
	private long modelId;
	private String modelName;
	private long totalPrice;
	private List<OrderColor> colorsSelected;
	private List<OrderAccessory> accessoriesSelected;

}
