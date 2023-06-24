package org.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.spring.javaconfig")
public class Client {

    public static void main(String args[]) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Client.class);
        Student student=context.getBean("student", Student.class);
        System.out.println(student.hashCode());
        student.study();

    }
}
