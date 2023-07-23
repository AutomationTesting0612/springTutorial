package org.spring.springpractice.beancreationConstructor;

public class Address {

    private String state;

    public Address(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                '}';
    }
}
