package com.cts.training.AccessoryService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.AccessoryService.service.AccessoryService;
import com.cts.training.entities.Entities.Models.*;
import io.swagger.annotations.Api;

@Api
//@RequestMapping("/accessories")
@CrossOrigin
@RestController
public class AccessoryController {
	
	@Autowired
	private AccessoryService accessoryService;

	 @GetMapping("/getaccessory/{id}")
	 public List<Accessory> getItem(@PathVariable("id") long id) {
		 List<Accessory> list=new ArrayList<Accessory>();
		 list= this.accessoryService.getById(id); 
		 return list;
	 }

	 @GetMapping("/accessories")
	 public List<Accessory> getAcessories(){
		 return accessoryService.getAll();
	 }
}

