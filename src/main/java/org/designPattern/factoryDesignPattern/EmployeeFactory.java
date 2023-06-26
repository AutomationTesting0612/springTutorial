package org.designPattern.factoryDesignPattern;

public class EmployeeFactory {

    public static Employee getEmployee(String emp) {
        if(emp.trim().equalsIgnoreCase("Android Developer")) {
            return new AndroidDeveloper();
        } else if(emp.trim().equalsIgnoreCase("Web Developer")) {
            return new WebDeveloper();
        } else {
            return null;
        }

    }
}
