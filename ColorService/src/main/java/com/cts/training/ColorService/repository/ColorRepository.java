package com.cts.training.ColorService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.training.entities.Entities.Models.*;
@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {

		@Query(value = "SELECT * FROM colors WHERE color_Id IN (SELECT color_Id FROM modelcolor WHERE model_Id = ?1)",nativeQuery = true)
	 	public List<Color> getAll(long id);



	}
