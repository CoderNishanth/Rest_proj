package com.example.FullStack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FullStack.Entity.ParentEntity;
import com.example.FullStack.Service.ParentService;

@RestController
public class ParentController {
    @Autowired ParentService service;
    @PostMapping("/save")
    public ParentEntity savedata(@RequestBody ParentEntity entity) {
        return service.savedata(entity);
    }
    @GetMapping("/get")
    public ParentEntity getdata(int id) {
        return service.getdata(id);
    }
}
