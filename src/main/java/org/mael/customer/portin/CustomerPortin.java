package org.mael.customer.portin;

import java.util.List;

import org.mael.customer.model.Customer;

public interface CustomerPortin {

	List<Customer> findAllCustomers();

	Customer findCustomerById(String id);

	Customer addCustomer(Customer customer);

	void deleteCustomer(String id);

	void updateCustomer(Customer customer);

	List<Customer> findByLastName(String lastName);

	List<Customer> findByAgeGreaterThan(int age);
}