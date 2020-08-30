package com.cts.training.SeriesModelService.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name="series")
public class Series {
	
	@Id
	@Column(name="seriesId")
	private long seriesId;
	
	@Column(name="seriesName")
	private String seriesName;
	
	
	

}
