package org.spring.springpractice.autowirewithconstructor;

public class Test1 {

    private Test2 test2;

    public Test1(Test2 test2) {
        this.test2 = test2;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "test2=" + test2 +
                '}';
    }
}
