package org.spring.springpractice.beancreationConstructor;

public class Student {

    private String name;

    private Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
