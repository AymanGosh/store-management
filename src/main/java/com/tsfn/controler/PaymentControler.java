package com.tsfn.controler;

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
//@RequestMapping(value="/80")
public class PaymentControler {
	@Autowired
	PaymentService paymentService;

//	// @RequestMapping(value="/departments/getall" , method = RequestMethod.GET)
//	@GetMapping(value = "/departments/getall")
//	public List<Department> getAllDepartments() {
//		return orderService.getAllDepartments();
//	}

//	// http://www.localhost:8080/departmetns/department/1 pathVariable
//	// http://www.localhost:8080/departmetns/department?id=1&name="R&D" queryParam
//	@GetMapping(value = "/departments/department")
//	public Optional<Department> getDepartmentByIdByQueryPatram(@RequestParam("id") int id) {
//		return orderService.getDepartment(id);
//	}

	@GetMapping(value = "/payments/payment/{id}")
	public Optional<Payment> getOrderByIdByPathVar(@PathVariable int id) {
		return paymentService.getPayment(id);
	}

	@PostMapping(value = "/payments/add", consumes = "application/json")
	public void createDepartment(@RequestBody Payment payment) {
		paymentService.createPayment(payment);
	}
}