package com.example.FullStack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FullStack.Entity.TeacherEntity;

@Repository
public interface TeacherRepo extends JpaRepository<TeacherEntity, Integer> {
}
