package org.spring.springpractice.beanwithuserdefinedatatype;

import lombok.Data;

@Data
public class Student {

    private String firstName;
    private String lastName;
    private int rollNo;
    private Address address;
}
