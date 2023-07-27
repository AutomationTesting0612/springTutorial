package org.spring.springpractice.springmvc.service;

import org.spring.springpractice.springmvc.entity.Student;
import org.spring.springpractice.springmvc.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        super();
        this.repository=repository;
    }
    @Override
    public List<Student> getAllStudent() {
        return repository.findAll();
    }
}
