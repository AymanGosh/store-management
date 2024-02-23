package com.tsfn.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tsfn.beans.Payment;
import com.tsfn.services.PaymentService;

@RestController

public class PaymentControler {
	@Autowired
	PaymentService paymentService;

	// g
	@GetMapping(value = "/payments/{method}")
	public List<Payment> getAllPaymentsByPaymentMethod(@PathVariable String method) {
		return paymentService.getAllPaymentsByPaymentMethod(method);
	}

	@GetMapping(value = "/payments/payment/{id}")
	public Optional<Payment> getOrderByIdByPathVar(@PathVariable int id) {
		return paymentService.getPayment(id);
	}

	@PostMapping(value = "/payments/add", consumes = "application/json")
	public void createDepartment(@RequestBody Payment payment) {
		paymentService.createPayment(payment);
	}
}