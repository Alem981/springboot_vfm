package com.vfm.fullstackbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vfm.fullstackbackend.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
