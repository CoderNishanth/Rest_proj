package com.example.FullStack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.FullStack.Entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {
    UserEntity findByEmail(String email);
}
