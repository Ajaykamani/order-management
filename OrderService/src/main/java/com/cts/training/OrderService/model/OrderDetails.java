package com.cts.training.OrderService.model;

import java.util.List;

import javax.persistence.CascadeType;
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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="order_details")
public class OrderDetails {
	
	@Id
	@GeneratedValue
	@Column(name = "orderid")
	private long orderId;
	@Column(name = "seriesid")
	private long seriesId;
	@Column(name = "seriesname")
	private String seriesName;
	@Column(name = "modelid")
	private long modelId;
	@Column(name = "modelname")
	private String modelName;
	@Column(name = "totalprice")
	private long totalPrice;
	@Column(name = "userid")
	private long userId;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_order_id", referencedColumnName = "orderid")
	private List<OrderAccessory> orderAccessory;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_order_id", referencedColumnName = "orderid")
	private List<OrderColor> orderColor;
	
	

}
