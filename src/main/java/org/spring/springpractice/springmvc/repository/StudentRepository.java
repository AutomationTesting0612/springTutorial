package org.spring.springpractice.springmvc.repository;

import org.spring.springpractice.springmvc.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
