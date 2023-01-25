package com.vfm.fullstackbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vfm.fullstackbackend.exception.UserNotFoundException;
import com.vfm.fullstackbackend.model.Driver;
import com.vfm.fullstackbackend.model.User;
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
	
	@GetMapping("/driver/{id}")
	Driver getUserById(@PathVariable Long id) {
		return driverRepository.findById(id)
				.orElseThrow(()->new UserNotFoundException(id));
	}
	   @PutMapping("/driver/{id}")
	    Driver updateDriver(@RequestBody Driver newDriver, @PathVariable Long id) {
	        return driverRepository.findById(id)
	                .map(driver -> {
	                  driver.setFirstName(newDriver.getFirstName());
	                  driver.setLastName(newDriver.getLastName());
	                  driver.setEmail(newDriver.getEmail());
	                  driver.setPhoneNumber(newDriver.getPhoneNumber());
	                  driver.setAge(newDriver.getAge());
	                  driver.setSalary(newDriver.getSalary());
	                    return driverRepository.save(driver);
	                }).orElseThrow(() -> new UserNotFoundException(id));
	    }


}