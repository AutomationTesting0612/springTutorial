package org.spring.valueannotation.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("stereoValueConfig.xml");
        Student student1=context.getBean("student", Student.class);
        System.out.println(student1);
        System.out.println(student1.getMobileNo());

    }
}
