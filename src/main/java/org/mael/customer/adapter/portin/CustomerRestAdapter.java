package org.mael.customer.adapter.portin;

import java.util.List;

import org.mael.customer.model.Customer;
import org.mael.customer.portin.CustomerPortin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class CustomerRestAdapter {

	private final CustomerPortin customerService;

	public CustomerRestAdapter(CustomerPortin customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping
	List<Customer> findAllCustomers() {
		return this.customerService.findAllCustomers();
	}

	@GetMapping("/{id}")
	Customer findCustomerById(@RequestParam("id") String id) {
		return this.customerService.findCustomerById(id);
	}

	@PostMapping
	Customer addCustomer(@RequestBody Customer customer) {
		return this.customerService.addCustomer(customer);
	}

	@DeleteMapping("/{id}")
	void deleteCustomer(@RequestParam("id") String id) {
		this.customerService.deleteCustomer(id);
	}

	@PutMapping
	void updateCustomer(@RequestBody Customer customer) {
		this.customerService.updateCustomer(customer);
	}
	
	@GetMapping("/lastname/{lastName}")
	public List<Customer> findByLastName(@RequestParam("lastName") String lastName) {
		return this.customerService.findByLastName(lastName);
	}
	
	@GetMapping("/age/{age}")
	public List<Customer> findByAgeGreaterThan(@RequestParam("age") int age) {
		return this.customerService.findByAgeGreaterThan(age);
}
}
