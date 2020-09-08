package com.cts.training.AccessoryService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cts.training.AccessoryService.repository.AccessoryRepository;
import com.cts.training.entities.Entities.Models.Accessory;
@Service
public class AccessoryService {

 @Autowired
private AccessoryRepository accessoryRepository;

 		public List<Accessory> getById(long id)
 		{
 			return this.accessoryRepository.getAll(id);
 			}

		public List<Accessory> getAll() {
			// TODO Auto-generated method stub
			return this.accessoryRepository.findAll();
		}
}
