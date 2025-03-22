package com.example.FullStack.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FullStack.Entity.TeacherEntity;
import com.example.FullStack.Repository.TeacherRepo;

@Service
public class TeacherService {
    @Autowired TeacherRepo teacherRepo;
    public TeacherEntity saveTeacher(TeacherEntity teacher) {
        return teacherRepo.save(teacher);
    }
}
