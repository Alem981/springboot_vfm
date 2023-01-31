package com.vfm.fullstackbackend.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vfm.fullstackbackend.model.Brand;
import com.vfm.fullstackbackend.model.Model;
import com.vfm.fullstackbackend.model.Vehicle;
import com.vfm.fullstackbackend.services.VehicleService;

@RestController
@CrossOrigin("http://localhost:3000")
public class VehicleController {
	@Autowired
	VehicleService vehicleService;
	
	@RequestMapping("/vehicles")
	public List<Vehicle> getAllVehicles() {
		return vehicleService.getAllVehicles();
	}
	
	@RequestMapping("/vehicle/{id}")
	public Optional<Vehicle> getVehicleById(@PathVariable int id) {
		return vehicleService.getVehicleById(id);
	}
	@RequestMapping("models/{id}/vehicles")
	public List<Vehicle> getVehiclesByModelId(@PathVariable int id) {
		return vehicleService.getVehicleByModelId(id);
	}
	@RequestMapping("/vehicles/{registration}")
	public 	List<Vehicle> getVehicleByRegistration(@PathVariable String registration) {
		return vehicleService.getVehiclesByRegistration(registration);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/models/{id}/vehicle")
	public void updateVehicle(@RequestBody Vehicle vehicle, @PathVariable int id) {
		vehicle.setModel(new Model(id, "", null));
 		vehicleService.updateVehicle(vehicle);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/models/{id}/vehicle")
	public void addVehicle(@RequestBody Vehicle vehicle, @PathVariable int id) {
		vehicle.setModel(new Model(id, "", null));
 		vehicleService.addVehicle(vehicle);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="models/vehicle/{id}")
	public void removeVehicle(@PathVariable int id) {
		vehicleService.removeVehicleById(id);
	}
}
