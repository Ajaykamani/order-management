package com.cts.training.entities.Entities.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
@Entity
@Table(name="models")
public class Models {
	
	@Id
	@Column(name="model_Id")
	private long modelId;
	
	@Column(name="model_Name")
	private String modelName;
	
	@Column(name="model_Price")
	private long modelPrice;
	
	
	@Column(name="series_Id")
	private long seriedId;
	

}
