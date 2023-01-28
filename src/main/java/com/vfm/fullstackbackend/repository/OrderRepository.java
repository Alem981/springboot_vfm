package com.vfm.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vfm.fullstackbackend.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
