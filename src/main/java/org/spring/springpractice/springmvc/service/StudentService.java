package org.spring.springpractice.springmvc.service;


import org.spring.springpractice.springmvc.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    public List<Student> getAllStudent();
}
