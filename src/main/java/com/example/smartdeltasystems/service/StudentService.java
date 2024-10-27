package com.example.smartdeltasystems.service;

import com.example.smartdeltasystems.entity.Student;
import com.example.smartdeltasystems.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, String updateName) {
        Student student = studentRepository.findById(id).get();
        student.setName(updateName);
        return studentRepository.save(student);
    }


    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
