package com.cts.training.entities.Entities.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="modelaccessories")
public class ModelAccessories {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "modelaccessories_Id")
	 private long modelAccessoriesId;


	 @ManyToOne
	 @JoinColumn(name = "model_Id")
	 private Models modelId;

	 @ManyToOne
	 @JoinColumn(name="accessories_Id")
	 private Accessory accessoriesId;

}
