package com.cts.training.OrderService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ordercoloraccessory")
public class OrderColorAccessory {
	@Id
	@GeneratedValue
	@Column(name="ordercoloraccessory_Id")
	private long ordercoloraccessoryId;
	
	@Column(name="color_Id")
	private long colorId;
	
	@Column(name="accessory_Id")
	private long accessoryId;
	
	@Column(name="Quantity")
	private long quantity;
	
//	@Column(name="amount")
//	private long amount;
}
