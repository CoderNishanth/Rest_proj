package com.example.FullStack.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FullStack.Entity.ParentEntity;
import com.example.FullStack.Repository.ParentRepo;

@Service
public class ParentService {
    @Autowired ParentRepo repo;
    public ParentEntity savedata(ParentEntity entity) {
        return repo.save(entity);
    }
    public ParentEntity getdata(int id) {
        return repo.findById(id).orElse(null);
    }
}
