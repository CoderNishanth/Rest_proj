package com.example.FullStack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FullStack.Service.EmailService;

@RestController
public class EmailController {
    @Autowired EmailService service;

    @PostMapping("/sendemail")
    public String sendEmail(String receiver, String subject, String body) {
        return service.senderMethod(receiver, subject, body);
    }
}
