package com.example.FullStack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FullStack.Entity.ParentEntity;

@Repository
public interface ParentRepo extends JpaRepository<ParentEntity, Integer> {

}
