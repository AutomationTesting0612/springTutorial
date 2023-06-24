package org.spring.jdbdWithOutXml.dao;



import org.spring.jdbdWithOutXml.entity.Student;

import java.util.List;

public interface StudentDao {

    public int insert(Student student);
    public int change(Student student);

    public int delete(Student student);

    public Student getStudent(int studentId);

    public List<Student> getStudentAll();
}
