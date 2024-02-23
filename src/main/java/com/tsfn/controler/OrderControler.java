package com.tsfn.controler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tsfn.beans.Order;
import com.tsfn.services.OrderService;

@RestController
//@RequestMapping(value="/80")
public class OrderControler {
	@Autowired
	OrderService orderService;

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

	@GetMapping(value = "/orders/order/{id}")
	public Optional<Order> getOrderByIdByPathVar(@PathVariable int id) {
		return orderService.getOrder(id);
	}

	@PostMapping(value = "/orders/add", consumes = "application/json")
	public void createDepartment(@RequestBody Order order) {
		orderService.createOrder(order);
	}

//	// http://www.localhost:8080/departmetns/?id=1
//	@DeleteMapping(value = "/departments/delete")
//	public void deleteDepartmentByIdByQueryParam(@RequestParam("id") int id) {
//		orderService.deleteDepartment(id);
//	}
//
//	@PutMapping(value = "/departments", consumes = "application/json")
//	public void updateDepartment(@RequestBody Department department) {
//		orderService.updateDepartment(department);
//	}

}