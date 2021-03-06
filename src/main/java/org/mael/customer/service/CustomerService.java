package org.mael.customer.service;

import java.util.List;

import org.mael.customer.model.Customer;
import org.mael.customer.portin.CustomerPortin;
import org.mael.customer.portout.CustomerPortout;
import org.springframework.stereotype.Component;

@Component
public class CustomerService implements CustomerPortin {
	
	private final CustomerPortout customerRepo;
	

	public CustomerService(CustomerPortout customerRepo) {
		this.customerRepo = customerRepo;
	}

	@Override
	public List<Customer> findAllCustomers() {
		return this.customerRepo.findAll();
	}

	@Override
	public Customer findCustomerById(Long id) {
		return this.customerRepo.findById(id);
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return this.customerRepo.add(customer);
	}

	@Override
	public void deleteCustomer(Long id) {
		 this.customerRepo.delete(id);
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		 this.customerRepo.update(customer);
		
	}

}
