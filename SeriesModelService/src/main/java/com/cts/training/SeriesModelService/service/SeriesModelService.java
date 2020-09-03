package com.cts.training.SeriesModelService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.cts.training.SeriesModelService.model.Models;
//import com.cts.training.SeriesModelService.model.Series;
import com.cts.training.SeriesModelService.repository.ModelRepo;
//import com.cts.training.SeriesModelService.repository.SeriesModelRepo;
import com.cts.training.SeriesModelService.repository.SeriesRepo;
import com.cts.training.entities.Entities.Models.Models;
import com.cts.training.entities.Entities.Models.Series;


@Service
public class SeriesModelService {
	@Autowired
	private SeriesRepo seriesRepo;
	@Autowired
	private ModelRepo modelRepo;
	//@Autowired
	//private SeriesModelRepo seriesModelRepo;
	
	
	public List<Series> getSeries(){
			return this.seriesRepo.getAll();
		
		}
	public List<Models> getModels(){
		return this.modelRepo.getAll();
	}
	
	public List<Models> getAllModelSeries(long id){
		return this.modelRepo.getAll();
	}
	
	public List<Models> getById(long id){
		return this.modelRepo.getAll(id);
	}
	
		
		

}
