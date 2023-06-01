package org.spring.stereoTypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("stereoConfig.xml");
        Student student1=context.getBean("student", Student.class);
        System.out.println(student1);

    }
}
