package com.tsfn.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsfn.beans.Order;
import com.tsfn.repository.OrderDAO;

@Service
public class OrderService {

	@Autowired
	OrderDAO orderDao;

	public void createOrder(Order order) {
		orderDao.saveOrder(order);
	}

	public Optional<Order> getOrder(int id) {
		return orderDao.getOrderById(id);
	}
}