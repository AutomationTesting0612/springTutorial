package org.designPattern.factoryDesignPattern;

public class ExecuteClass {

    public static void main(String[] args) {

        Employee emp1 = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(emp1.salary());

        Employee emp2 = EmployeeFactory.getEmployee("Web Developer");
        System.out.println(emp2.salary());

        Employee emp3 = EmployeeFactory.getEmployee("Test");
        System.out.println(emp3.salary());
    }
}
