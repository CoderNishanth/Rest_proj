package com.example.FullStack.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FullStack.Entity.ChildEntity;
import com.example.FullStack.Repository.ChildRepo;


@Service
public class ChildService {
    @Autowired ChildRepo childRepo;
    public ChildEntity saveChild(ChildEntity childEntity) {
        if(childEntity.getParentEntity()!=null) {
            childEntity.getParentEntity().setChildEntity(childEntity);
        }
        return childRepo.save(childEntity);
    }
}
