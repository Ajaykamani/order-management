package com.cts.training.SeriesModelService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.cts.training.SeriesModelService.model.Models;
//import com.cts.training.SeriesModelService.model.Series;
import com.cts.training.SeriesModelService.service.SeriesModelService;
import com.cts.training.entities.Entities.Models.Models;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.swagger.annotations.Api;
@Api
@RestController
public class SeriesModelController {
	
	@Autowired
	private SeriesModelService seriesmodelservice;
	
	
	@Value("${msg:Config Server is not working. Please check...}")
    private String msg;
	
	//@HystrixCommand(fallbackMethod = "fallBackGetMsg" , commandProperties = {
		   //   @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")})
    @GetMapping("/msg")
    public String getMsg() {
        return this.msg;
    }
   // public String fallBackGetMsg() {
   //     return "fall back method";
  //  }
	
	
	@GetMapping("/series")
	public List<com.cts.training.entities.Entities.Models.Series> getSeries(){
		
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
