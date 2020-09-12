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


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="ordercolor")
public class OrderColor {
	
	@Id
	@GeneratedValue
	@Column(name = "ordercolorid")
	private long orderColorId;
	@Column(name = "colorid")
	private long colorId;
	@Column(name = "colorname")
	private String colorName;

}
