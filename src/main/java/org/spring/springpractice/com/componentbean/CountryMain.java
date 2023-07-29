package org.spring.springpractice.com.componentbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryMain {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("springpractice/componentbean.xml");

       Country country=  context.getBean("ob", Country.class);

        System.out.println(country);
    }
}
