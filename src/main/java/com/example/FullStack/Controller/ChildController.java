package com.example.FullStack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FullStack.Entity.ChildEntity;
import com.example.FullStack.Service.ChildService;

@RestController
public class ChildController {
    @Autowired ChildService childService;

    @PostMapping("/child")
    public ChildEntity saveChild(@RequestBody ChildEntity childEntity) {
        return childService.saveChild(childEntity);
    }
}
