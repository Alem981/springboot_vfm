package com.vfm.fullstackbackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vfm.fullstackbackend.model.Brand;
import com.vfm.fullstackbackend.model.Order;
import com.vfm.fullstackbackend.repository.BrandRepository;
import com.vfm.fullstackbackend.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	
	public List<Order> getAllOrders(){
		return orderRepository.findAll();
	}
	public Optional<Order> getOrderById(int id){
		return orderRepository.findById(id);
	}
	public void addOrder(Order id) {
		orderRepository.save(id);
	}
	public void updateOrder(Order id) {
		orderRepository.save(id);
	}
	public void removeoRDERById(int id) {
		orderRepository.deleteById(id);
	}
	
}
