package org.mael.customer.portin;

import java.util.List;

import org.mael.customer.model.Customer;

public interface CustomerPortin {

	List<Customer> findAllCustomers();

	Customer findCustomerById(Long id);

	Customer addCustomer(Customer customer);

	void deleteCustomer(Long id);

	void updateCustomer(Customer customer);
}