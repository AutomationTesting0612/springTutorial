package org.spring.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Test {

    public static void main(String[] args) {

//        ApplicationContext context= new ClassPathXmlApplicationContext("singletonConfig.xml");
//        Students student1=context.getBean("students", Students.class);
//        Students student2=context.getBean("students", Students.class);
//
//        System.out.println(student1.hashCode());
//        System.out.println(student2.hashCode());

        ApplicationContext context=  new AnnotationConfigApplicationContext(Test.class);
       Students students= context.getBean("students", Students.class);
        Students students1= context.getBean("students", Students.class);
        System.out.println(students.hashCode());
        System.out.println(students1.hashCode());

    }
}
