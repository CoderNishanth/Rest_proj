package com.example.FullStack.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FullStack.Entity.StudentEntity;
import com.example.FullStack.Repository.StudentRepo;

@Service
public class StudentService {
    @Autowired StudentRepo studentRepo;

    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepo.save(student);
    }
}
