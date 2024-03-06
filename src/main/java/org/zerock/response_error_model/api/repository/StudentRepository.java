package org.zerock.response_error_model.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.response_error_model.api.domain.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByGrade(int targetGrade);
}