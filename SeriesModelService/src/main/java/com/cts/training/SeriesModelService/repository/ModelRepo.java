package com.cts.training.SeriesModelService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.training.entities.Entities.Models.Models;

//import com.cts.training.SeriesModelService.model.Models;

@Repository
public interface ModelRepo extends JpaRepository<Models, Long> {
	
	@Query(value="SELECT * FROM models",nativeQuery=true)
	public List<Models> getAll();
	
	@Query(value="SELECT * from models where series_Id=?1",nativeQuery=true)
	public List<Models> getAll(Long id);

}
