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


    //If dependent Test2 class have only one constructor, then we don't need to write the autowired in Test1 for user defined datatype as Test2


}
