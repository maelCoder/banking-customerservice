package org.mael.customer.portout;

import java.util.List;

import org.mael.customer.model.Customer;

public interface CustomerPortout {

	List<Customer> findAll();

	Customer findById(Long id);

	Customer add(Customer p);

	void delete(Long id);

	void update(Customer p);
}
