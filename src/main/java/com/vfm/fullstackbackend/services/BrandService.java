package com.vfm.fullstackbackend.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vfm.fullstackbackend.model.Brand;
import com.vfm.fullstackbackend.repository.BrandRepository;

@Service
public class BrandService {
	@Autowired
	BrandRepository brandRepository;
	
	public BrandService() {
		super();
	}
 	public List<Brand> getAllBrands(){
		return brandRepository.findAll();
	}
	
	public Optional<Brand> getBrandById(int id){
		return brandRepository.findById(id);
	}
	public void addBrand(Brand id) {
		 brandRepository.save(id);
	}
	public void updateBrand(Brand id) {
		 brandRepository.save(id);
	}
	public void removeBrandById(int id) {
		 brandRepository.deleteById(id);
	}
	
}
