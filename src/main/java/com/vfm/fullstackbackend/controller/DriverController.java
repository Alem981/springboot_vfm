package com.vfm.fullstackbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.vfm.fullstackbackend.model.Driver;
import com.vfm.fullstackbackend.repository.DriverRepository;


@RestController
@CrossOrigin("http://localhost:3000")
public class DriverController {

	@Autowired
	private DriverRepository driverRepository;

	@PostMapping("/driver")
	Driver newDriver(@RequestBody Driver newDriver) {
		return driverRepository.save(newDriver);
	}

	@GetMapping("/drivers")
	List<Driver> getDrivers() {
		return driverRepository.findAll();
	}

}