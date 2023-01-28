package com.vfm.fullstackbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vfm.fullstackbackend.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
	public List<Vehicle>findByModelId(Integer id);
	public List<Vehicle>findByRegistration(String registration);
}

