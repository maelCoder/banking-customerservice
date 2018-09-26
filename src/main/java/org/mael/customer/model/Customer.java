package org.mael.customer.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Customer {

	private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
}
