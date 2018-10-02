package org.mael.customer.adapter.portout;

import java.util.List;

import org.mael.customer.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoCustomerRepo extends MongoRepository<Customer, String>{
	
	List<Customer> findByLastName(String lastName);

	List<Customer> findByAgeGreaterThan(int age);

}
