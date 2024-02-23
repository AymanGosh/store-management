package com.tsfn.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsfn.beans.Payment;
import com.tsfn.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	public void createPayment(Payment payment) {
		paymentRepository.save(payment);
	}

	public Optional<Payment> getPayment(int id) {
		return paymentRepository.findById(id);
	}

	public List<Payment> getAllPaymentsByPaymentMethod(String method) {
		return paymentRepository.findAllByOrders_Method(method);
	}
}