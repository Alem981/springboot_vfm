package com.vfm.fullstackbackend.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vfm.fullstackbackend.model.Model;
import com.vfm.fullstackbackend.repository.ModelRepository;

@Service
public class ModelService {
	@Autowired
	ModelRepository modelRepository;
	
	public ModelService() {
		super();
	}
 	public List<Model> getAllModels(){
		return modelRepository.findAll();
	}
	
	public Optional<Model> getModelById(int id){
		return modelRepository.findById(id);
	}
	public void addModel(Model id) {
		modelRepository.save(id);
	}
	public void updateModel(Model id) {
		modelRepository.save(id);
	}
	public void removeModelById(int id) {
		modelRepository.deleteById(id);
	}
	
	public List<Model> getModelByBrandId(int id){
		return modelRepository.findByBrandId(Integer.valueOf(id));
	}
	public List<Model> getModelsByName(String name){
		return modelRepository.findByName(name);
	}
}
