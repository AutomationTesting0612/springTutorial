package org.designPattern.factoryDesignPattern;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Getting WebDeveloper Salary");
        return 50000;
    }
}
