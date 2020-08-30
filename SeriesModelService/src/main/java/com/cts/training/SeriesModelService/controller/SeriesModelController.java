package com.cts.training.SeriesModelService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.SeriesModelService.model.Models;
import com.cts.training.SeriesModelService.model.Series;
import com.cts.training.ServiceModelService.service.SeriesModelService;

@RestController
public class SeriesModelController {
	
	@Autowired
	private SeriesModelService seriesmodelservice;
	
	
	@GetMapping("/series")
	public List<Series> getSeries(){
		
		return seriesmodelservice.getSeries();
		
	}
	
	@GetMapping("/models")
	public List<Models> getModels(){
		return seriesmodelservice.getModels();
		
	}
	@GetMapping("/getmodels/{id}")
	public List<Models> getModel(@PathVariable("id") long id) {
		List<Models> list=new ArrayList<Models>();
		list=this.seriesmodelservice.getById(id);
		return list;
		
	}
	
	

}
