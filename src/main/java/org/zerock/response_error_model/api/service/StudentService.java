package org.zerock.response_error_model.api.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.zerock.response_error_model.api.domain.Student;
import org.zerock.response_error_model.api.dto.request.GradeRequest;
import org.zerock.response_error_model.api.dto.request.StudentRequest;
import org.zerock.response_error_model.api.repository.StudentRepository;

import java.util.List;

@Slf4j
@Service
public class StudentService {
    private final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAll() {
        List<Student> students = repository.findAll(Sort.by(Sort.Direction.ASC, "grade"));
        log.info("Found {} students", students.size());
        return students;
    }

    public Student create(StudentRequest newStudent) {
        Student student = Student.builder()
                .name(newStudent.getName())
                .grade(Integer.valueOf(newStudent.getGrade()))
                .build();
        log.info("Create Student: " + student);
        return repository.save(student);
    }

    public List<Student> getStudentsByGrade(GradeRequest targetGrade) {
        GradeRequest target = GradeRequest.builder()
                .grade(targetGrade.getGrade())
                .build();

        List<Student> byGrade = repository.findByGrade(target.getGrade());
        log.info("target -> {} Found {} students", targetGrade, byGrade.size());
        return byGrade;
    }
}