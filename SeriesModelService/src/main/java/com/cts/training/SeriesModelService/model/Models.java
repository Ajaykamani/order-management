package com.cts.training.SeriesModelService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@Column(name="modelId")
	private long modelId;
	
	@Column(name="modelName")
	private String modelName;
	
	@Column(name="modelPrice")
	private int modelPrice;
	
	@ManyToOne
	@JoinColumn(name="seriesId")
	private Series seriedId;
	

}
