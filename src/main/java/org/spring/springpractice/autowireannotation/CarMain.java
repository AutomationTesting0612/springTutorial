package org.spring.springpractice.autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("springpractice/autowireannotation.xml");
        Car car = context.getBean("car", Car.class);
        System.out.println(car);
    }
}
