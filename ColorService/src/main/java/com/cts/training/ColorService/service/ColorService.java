package com.cts.training.ColorService.service;

import java.util.List;
import com.cts.training.entities.Entities.Models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.ColorService.repository.ColorRepository;

@Service
public class ColorService {
	
	@Autowired
	private ColorRepository colorRepository;

	public List<Color> getById(long id)
	 {
	 return this.colorRepository.getAll(id);
	 }

}
