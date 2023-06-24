package org.spring.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("prototypeConfig.xml");
        Stu stu1=context.getBean("stu", Stu.class);
        Stu stu2=context.getBean("stu", Stu.class);

        System.out.println(stu1.hashCode());
        System.out.println(stu2.hashCode());

    }
}
