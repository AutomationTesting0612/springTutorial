package org.spring.springpractice.beanwithcollectiondatatype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

    public static void main(String[] args) {

        ApplicationContext ctx=  new ClassPathXmlApplicationContext("springpractice/PersonConfig.xml");
        Person p = (Person) ctx.getBean("person");
        System.out.println(p);
        System.out.println(p.getFirstName());
        System.out.println(p.getAccountNo());
        System.out.println(p.getPersonId());
    }
}
