package com.tsfn.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsfn.beans.Payment;
import com.tsfn.repository.PaymentDAO;

@Service
public class PaymentService {

	@Autowired
	PaymentDAO paymentDao;

	public void createPayment(Payment payment) {
		paymentDao.savePayment(payment);
	}

	public Optional<Payment> getPayment(int id) {
		return paymentDao.getPaymentById(id);
	}
}