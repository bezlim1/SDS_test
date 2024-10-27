package com.example.smartdeltasystems.repository;


import com.example.smartdeltasystems.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
