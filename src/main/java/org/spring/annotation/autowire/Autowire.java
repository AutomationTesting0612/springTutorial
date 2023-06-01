package org.spring.annotation.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowire {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
//        Emp emp =context.getBean("emp1", Emp.class);
//        System.out.println(emp);
        EmpClass emp =context.getBean("emp1", EmpClass.class);
        System.out.println(emp);
    }
}
