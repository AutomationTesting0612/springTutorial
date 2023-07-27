package org.spring.springpractice.autowirewithconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1Main {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("springpractice/autowireConstructor.xml");
  Test1 test1=  context.getBean("test1",Test1.class);
        System.out.println(test1);

    }
}
