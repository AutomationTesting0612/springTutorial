package org.spring.springpractice.beancreationambiguityproblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SumMain {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("springpractice/constbeanambiguity.xml");
   Sum sum = (Sum) context.getBean("sum");
        System.out.println(sum);

    }
}
