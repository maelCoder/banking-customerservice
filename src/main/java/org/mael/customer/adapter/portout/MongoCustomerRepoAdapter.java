package org.mael.customer.adapter.portout;

import java.util.List;

import org.mael.customer.model.Customer;
import org.mael.customer.portout.CustomerPortout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("mongo-db")
public class MongoCustomerRepoAdapter implements CustomerPortout {

	@Autowired
	private MongoCustomerRepo repo;

	@Override
	public List<Customer> findAll() {
		return this.repo.findAll();
	}

	@Override
	public Customer findById(String id) {
		return this.repo.findById(id).orElse(null);
	}

	@Override
	public Customer add(Customer p) {
		return this.repo.save(p);
	}

	@Override
	public void delete(String id) {
		this.repo.deleteById(id);
	}

	@Override
	public void update(Customer p) {
		this.repo.save(p);
	}

	@Override
	public List<Customer> findByLastName(String lastName) {
		return this.repo.findByLastName(lastName);
	}

	@Override
	public List<Customer> findByAgeGeaterThan(int age) {
		return this.repo.findByAgeGreaterThan(age);
	}

}
