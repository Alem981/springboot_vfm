package com.vfm.fullstackbackend.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vfm.fullstackbackend.model.Brand;
import com.vfm.fullstackbackend.services.BrandService;

@RestController
public class BrandController {
	@Autowired
	BrandService brandService;

	@RequestMapping("/brands")
	public List<Brand> getBrands() {
		return brandService.getAllBrands();
	}
	
	@RequestMapping("/brand/{id}")
	public Optional<Brand> getBrandById(@PathVariable int id) {
		return brandService.getBrandById(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/brand")
	public void addBrand(@RequestBody Brand id) {
		brandService.addBrand(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/brand/{id}")
	public void updateBrand(@RequestBody Brand id) {
		brandService.updateBrand(id);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/brand/{id}")
	public void removeBrand(@PathVariable int id) {
		brandService.removeBrandById(id);
	}
}
