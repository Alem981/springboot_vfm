package com.vfm.fullstackbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vfm.fullstackbackend.model.Model;

public interface ModelRepository extends JpaRepository<Model, Integer> {
	 public List<Model>findByBrandId(Integer id);
	 public List<Model>findByName(String name);
	  
}
