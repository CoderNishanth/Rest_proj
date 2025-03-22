package com.example.FullStack.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.FullStack.Entity.ChildEntity;

@Repository
public interface ChildRepo extends JpaRepository<ChildEntity, Integer> {

}
