package org.spring.springpractice.beanwithuserdefinedatatype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

    public static void main(String[] args) {

        ApplicationContext ctx1= new ClassPathXmlApplicationContext("springpractice/userDT.xml");
        Student student= (Student) ctx1.getBean("stu");
        System.out.println(student);
    }
}
