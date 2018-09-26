package org.mael.customer.adapter.portout;

import java.util.ArrayList;
import java.util.List;

import org.mael.customer.model.Customer;
import org.mael.customer.portout.CustomerPortout;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Profile("in-memory-db")
@NoArgsConstructor
@Getter
@Setter
public class InMemoryCustomerRepo implements CustomerPortout {

	private List<Customer> customers = new ArrayList<>();
	private Long id = 0l;

	@Override
	public List<Customer> findAll() {
		return this.customers;
	}

	@Override
	public Customer findById(Long id) {
		return this.customers.stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
	}

	@Override
	public Customer add(Customer p) {
		p.setId(this.id++);
		this.customers.add(p);
		return p;
	}

	@Override
	public void delete(Long id) {
		Customer customer = findById(id);
		if (customer != null) {
			this.customers.remove(customer);
		}
	}

	@Override
	public void update(Customer p) {
		Customer customer = findById(p.getId());
		customer.setFirstName(p.getFirstName());
		this.customers.set(this.customers.indexOf(customer), customer);
	}

}
