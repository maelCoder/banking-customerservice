package org.mael.customer.portout;

import java.util.List;

import org.mael.customer.model.Customer;

public interface CustomerPortout {

	List<Customer> findAll();

	Customer findById(String id);

	Customer add(Customer p);

	void delete(String id);

	void update(Customer p);

	List<Customer> findByLastName(String lastName);

	List<Customer> findByAgeGeaterThan(int age);
}
