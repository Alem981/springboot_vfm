package com.vfm.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vfm.fullstackbackend.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long>{

}
