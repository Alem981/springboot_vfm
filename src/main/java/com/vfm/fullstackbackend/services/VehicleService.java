package com.vfm.fullstackbackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vfm.fullstackbackend.model.Model;
import com.vfm.fullstackbackend.model.Vehicle;
import com.vfm.fullstackbackend.repository.VehicleRepository;

@Service
public class VehicleService {
@Autowired
VehicleRepository vehicleRepository;
public VehicleService() {
	super();
}
	public List<Vehicle> getAllVehicles(){
	return vehicleRepository.findAll();
}

public Optional<Vehicle> getVehicleById(int id){
	return vehicleRepository.findById(id);
}
public void addVehicle(Vehicle id) {
	vehicleRepository.save(id);
}
public void updateVehicle(Vehicle id) {
	vehicleRepository.save(id);
}
public void removeVehicleById(int id) {
	vehicleRepository.deleteById(id);
}

public List<Vehicle> getVehicleByModelId(int id){
	return vehicleRepository.findByModelId(Integer.valueOf(id));
}
public List<Vehicle> getVehiclesByRegistration(String registration){
	return vehicleRepository.findByRegistration(registration);
}
}
