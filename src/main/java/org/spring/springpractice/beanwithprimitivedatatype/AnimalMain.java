package org.spring.springpractice.beanwithprimitivedatatype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalMain {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("springpractice/animalConfig.xml");
        Animal animal = (Animal) context.getBean("test1");
        System.out.println(animal);
        System.out.println(animal.getBreed());
        System.out.println(animal.getColor());
        System.out.println(animal.getHeight());
    }
}
