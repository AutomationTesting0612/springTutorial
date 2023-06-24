package org.spring.jdbdWithOutXml;


import org.spring.jdbdWithOutXml.dao.StudentDao;
import org.spring.jdbdWithOutXml.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Jdbc {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao =context.getBean("studentDao", StudentDao.class);
        Student student = new Student();
        student.setId(1);
        student.setName("Akhil");
        student.setCity("Indora");
        int result = studentDao.insert(student);
        System.out.println(result);
    }
}
