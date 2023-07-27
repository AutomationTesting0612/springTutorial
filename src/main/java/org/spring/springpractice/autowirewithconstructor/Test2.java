package org.spring.springpractice.autowirewithconstructor;

public class Test2 {

    private String name;

    public Test2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "name='" + name + '\'' +
                '}';
    }
}
