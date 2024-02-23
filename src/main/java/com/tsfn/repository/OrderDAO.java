package com.tsfn.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.tsfn.beans.Order;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class OrderDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public void saveOrder(Order order) {
		entityManager.persist(order);
	}

	public Optional<Order> getOrderById(int id) {
		return Optional.ofNullable(entityManager.find(Order.class, id));
	}

}