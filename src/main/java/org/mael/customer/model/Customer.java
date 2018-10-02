package org.mael.customer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Document(collection="customer")
public class Customer {

	@Id
	private String id;
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
}
