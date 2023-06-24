package org.spring.jdbc;

import org.spring.jdbc.dao.StudentDao;
import org.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Jdbc {

    public static void main(String args[]) {


        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
//        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
//        String query= "insert into student(id, name, address) values(?,?,?)";
//        jdbcTemplate.update(query,14, "AkhilSharma", "Indora");
//        System.out.println("The query is executed");

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student student= new Student();
        //insert
//        student.setId(123);
//        student.setAddress("Nurpur");
//        student.setName("Ram");
//        int r = studentDao.insert(student);
//        System.out.println("insert done" + r);

        //update
//        student.setId(123);
//        student.setName("test");
//        student.setAddress("Jassur");
//        int r=studentDao.change(student);
//        System.out.println("The row updated"+ r);

        //delete
//        student.setId(123);
//        int r= studentDao.delete(student);
//        System.out.println("row deleted" + r);

        //select
//        student.setId(12);
//        Student r = studentDao.getStudent(12);
//        System.out.println(r);

        //select All Student

        List<Student> studentList=studentDao.getStudentAll();
        System.out.println(studentList);
    }
}
