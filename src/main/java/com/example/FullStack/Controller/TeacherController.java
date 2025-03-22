package com.example.FullStack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FullStack.Entity.TeacherEntity;
import com.example.FullStack.Service.TeacherService;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TeacherController {
    @Autowired TeacherService teacherService;
    @PostMapping("/saveTeacher")
    public TeacherEntity saveTeacher(@RequestBody TeacherEntity teacher) {
        return teacherService.saveTeacher(teacher);
    }
}
