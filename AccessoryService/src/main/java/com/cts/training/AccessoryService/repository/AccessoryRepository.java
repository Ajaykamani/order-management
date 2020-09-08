package com.cts.training.AccessoryService.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.cts.training.entities.Entities.Models.Accessory;




@Repository
public interface AccessoryRepository extends JpaRepository<Accessory, Long> {

	@Query(value = "SELECT * FROM accessories WHERE accessories_Id IN (SELECT accessories_Id FROM modelaccessories WHERE model_Id = ?1)",nativeQuery = true)
	public List<Accessory> getAll(long id);
	}
