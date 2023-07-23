package org.spring.springpractice.beanwithcollectiondatatype;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class Person {

    private String firstName;
    private List<String> accountNo; //Collection Data Type
    private Set<String> personId; //Collection Data Type


}
