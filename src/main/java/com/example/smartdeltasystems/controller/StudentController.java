package com.example.smartdeltasystems.controller;

import com.example.smartdeltasystems.entity.Student;
import com.example.smartdeltasystems.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/get")
    public List<Student> searchEmployeeById () {
        List<Student> searchStudent = studentService.getAllStudents();
        return searchStudent;
    }

    @PostMapping("/add")
    public Student saveStudent(@RequestBody Student student) {
        Student addStudent = studentService.saveStudent(student);
        return addStudent;
    }

    @PutMapping("/update")
    public Student updateEmployee (@RequestParam Long id, @RequestParam String updateName){
        Student updatedStudent = studentService.updateStudent (id, updateName);
        return updatedStudent;
    }

    @DeleteMapping("/delete")
    public void deleteStudent (@RequestParam Long id) {
        studentService.deleteStudent(id);
    }
}
