package org.spring.jdbdWithOutXml.dao;


import org.spring.jdbdWithOutXml.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        String query= "insert into student(id, name, address) values(?,?,?)";
        int result = jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return result;
    }

    @Override
    public int change(Student student) {
        String query="update student set name=?, address=? where id=?";
        return jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
    }

    @Override
    public int delete(Student student) {
        String query="delete from student where id=?";
        return jdbcTemplate.update(query,student.getId());
    }

    @Override
    public Student getStudent(int studentId) {
        String query = "select * from Student where id=?";
        RowMapper<Student> rowMapper= new RowMappersImpl();
        return jdbcTemplate.queryForObject(query, rowMapper, studentId);
    }

    @Override
    public List<Student> getStudentAll() {
        String query = "select * from Student";
        return jdbcTemplate.query(query, new RowMappersImpl());
    }
}
