package com.example.FullStack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FullStack.Entity.StudentEntity;
import com.example.FullStack.Service.StudentService;

@RestController
public class StudentController {
    @Autowired StudentService studentService;
    @PostMapping("/saveStudent")
    public StudentEntity saveStudent(StudentEntity student) {
        return studentService.saveStudent(student);
    }
}
