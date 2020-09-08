package com.cts.training.OrderService.model;

import java.util.List;

import javax.persistence.CascadeType;
//import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name="orderdetails")
public class OrderDetails {
	
	@Id
	@GeneratedValue
	@Column(name="order_Id")
	private long orderId;
	
	@Column(name="series_Id")
	private long seriesId;
	
	@Column(name="model_Id")
	private long modelId;
	
	@Column(name="totalPrice")
	private long price;
	
	@OneToMany(targetEntity = OrderColorAccessory.class,cascade = CascadeType.ALL)
	@JoinColumn(name="order_id" ,referencedColumnName = "order_id")
	private List<OrderColorAccessory> ordercoloraccessories;

}
