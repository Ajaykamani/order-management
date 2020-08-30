package com.cts.training.SeriesModelService.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.training.SeriesModelService.model.Models;
@Repository
public interface SeriesModelRepo extends JpaRepository<Models, Long> {
	
	//@Query(value="SELECT * from model where modelId in"+"(select modelId where=?1)",nativeQuery=true)
	//public List<Models> getAll(Long id);

}
