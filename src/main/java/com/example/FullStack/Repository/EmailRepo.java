package com.example.FullStack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FullStack.Entity.EmailEntity;

public interface EmailRepo extends JpaRepository<EmailEntity, Integer> {

}
