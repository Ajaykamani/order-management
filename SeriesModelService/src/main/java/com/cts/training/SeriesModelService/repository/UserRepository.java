package com.cts.training.SeriesModelService.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.SeriesModelService.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
      
	List<User> findByuserName(String username);
	
	
}
