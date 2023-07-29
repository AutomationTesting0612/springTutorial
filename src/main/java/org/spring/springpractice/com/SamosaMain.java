package org.spring.springpractice.com;

import org.spring.springpractice.com.configurationannotation.Samosa;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration //Configuration removed xml file
//@ComponentScan
//@SpringBootApplication

@SpringBootApplication
@Configuration
@ComponentScan
public class SamosaMain {

    public static void main(String[] args) {

//    ApplicationContext context= new ClassPathXmlApplicationContext("springpractice/samosaconfigutationannotation.xml");
//   Samosa samosa=  context.getBean("samosa", Samosa.class);
//        System.out.println(samosa);
//    }

        ApplicationContext context = new AnnotationConfigApplicationContext(SamosaMain.class);
        Samosa samosa = context.getBean("samosa", Samosa.class);
        System.out.println(samosa);
    }
}
