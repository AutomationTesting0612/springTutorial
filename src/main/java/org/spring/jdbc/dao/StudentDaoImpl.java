package org.spring.jdbc.dao;

import org.spring.jdbc.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao{

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
        int result = jdbcTemplate.update(query, student.getId(), student.getName(), student.getAddress());
        return result;
    }

    @Override
    public int change(Student student) {
        String query="update student set name=?, address=? where id=?";
        return jdbcTemplate.update(query,student.getName(),student.getAddress(),student.getId());
    }

    @Override
    public int delete(Student student) {
        String query="delete from student where id=?";
        return jdbcTemplate.update(query,student.getId());
    }

    @Override
    public Student getStudent(int studentId) {
        String query = "select * from Student where id=?";
        RowMapper<Student> rowMapper= new RowMapperImpl();
        return jdbcTemplate.queryForObject(query, rowMapper, studentId);
    }

    @Override
    public List<Student> getStudentAll() {
        String query = "select * from Student";
       return jdbcTemplate.query(query, new RowMapperImpl());
    }


}
