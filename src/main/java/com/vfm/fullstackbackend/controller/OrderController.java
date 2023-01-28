package com.vfm.fullstackbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.vfm.fullstackbackend.model.Order;
import com.vfm.fullstackbackend.model.Vehicle;
import com.vfm.fullstackbackend.repository.OrderRepository;
import com.vfm.fullstackbackend.services.OrderService;


@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping("/orders")
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}

	@RequestMapping("/order/{id}")
	public Optional<Order> getBrandById(@PathVariable int id) {
		return orderService.getOrderById(id);
	}
	

	@RequestMapping(method = RequestMethod.PUT, value = "/vehicle/{id}/order")
	public void updateOrder(@RequestBody Order order, @PathVariable int id) {
		order.setVehicle(new Vehicle(id, "", id, id, id, null));
		orderService.updateOrder(order);
	} 

	@RequestMapping(method = RequestMethod.POST, value = "/vehicle/{id}/order")
	public void addOrder(@RequestBody Order order, @PathVariable int id) {
		order.setVehicle(new Vehicle(id, "", id, id, id, null));
		orderService.addOrder(order);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/order/{id}")
	public void removeModel(@PathVariable int id) {
		orderService.removeoRDERById(id);
	}

}
