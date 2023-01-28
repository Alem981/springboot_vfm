package com.vfm.fullstackbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vfm.fullstackbackend.model.Brand;
import com.vfm.fullstackbackend.model.Model;
import com.vfm.fullstackbackend.services.ModelService;

@RestController
public class ModelController {
@Autowired
ModelService modelService;
@RequestMapping("/models")
public List<Model> getAllModels() {
	return modelService.getAllModels();
}

@RequestMapping("/model/{id}")
public Optional<Model> getBrandById(@PathVariable int id) {
	return modelService.getModelById(id);
}
@RequestMapping("brand/{id}/models")
public List<Model> getModelsByBrandId(@PathVariable int id) {
	return modelService.getModelByBrandId(id);
}

@RequestMapping("/models/{name}")
public 	List<Model> getModelsByName(@PathVariable String name) {
	return modelService.getModelsByName(name);
}

@RequestMapping(method=RequestMethod.PUT, value="/model/{id}")
public void updateModel(@RequestBody Model model, @PathVariable int id) {
	model.setBrand(new Brand(id, ""));
	modelService.updateModel(model);
}
@RequestMapping(method=RequestMethod.POST, value="/brands/{id}/model")
public void addModel(@RequestBody Model model, @PathVariable int id) {
	model.setBrand(new Brand(id, ""));
	modelService.addModel(model);
}
@RequestMapping(method=RequestMethod.DELETE, value="/model/{id}")
public void removeModel(@PathVariable int id) {
	modelService.removeModelById(id);
}
}
