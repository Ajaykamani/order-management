package com.cts.training.SeriesModelService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.SeriesModelService.model.Series;
@Repository
public interface SeriesRepo extends JpaRepository<Series, Long> {
	
	public List<Series> getAll();

}

