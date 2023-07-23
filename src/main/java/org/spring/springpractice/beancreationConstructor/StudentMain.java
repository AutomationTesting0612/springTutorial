package org.spring.springpractice.beancreationConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("springpractice/constbean.xml");
   Student student = (Student) context.getBean("student");
        System.out.println(student);

    }
}
