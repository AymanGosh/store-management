package com.tsfn.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.tsfn.beans.Payment;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PaymentDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public void savePayment(Payment payment) {
		entityManager.persist(payment);
	}

	public Optional<Payment> getPaymentById(int id) {
		return Optional.ofNullable(entityManager.find(Payment.class, id));
	}

//	public void updateDepartment(Department department) {
//		entityManager.merge(department);
//	}
//
//	public void deleteDepartment(int id) {
//		getDepartmentById(id).ifPresent(department -> entityManager.remove(department));
//	}
//
//	public List<Department> getAllDepartments() {
//		return entityManager.createQuery("SELECT d FROM Department d", Department.class).getResultList();
//
//	}
}
