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
@Table(name="orderaccessory")
public class OrderAccessory {
	
	@Id
	@GeneratedValue
	@Column(name = "orderaccessoryid")
	private long orderAccessoryId;
	@Column(name = "accessoryid")
	private long accessoryId;
	@Column(name = "accessoryname")
	private String accessoryName;

}
