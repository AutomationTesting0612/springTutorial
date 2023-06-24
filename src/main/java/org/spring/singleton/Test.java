package org.spring.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("singletonConfig.xml");
        Students student1=context.getBean("students", Students.class);
        Students student2=context.getBean("students", Students.class);

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}
