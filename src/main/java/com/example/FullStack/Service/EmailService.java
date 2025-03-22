package com.example.FullStack.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.FullStack.Entity.EmailEntity;
import com.example.FullStack.Repository.EmailRepo;

import jakarta.mail.internet.MimeMessage;
import jakarta.mail.MessagingException;

@Service
public class EmailService {
    @Autowired JavaMailSender sender;
    @Autowired EmailRepo repo;

    public String senderMethod(String receiver, String subject, String body) {
        try {
            MimeMessage message = sender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message,false);
            helper.setTo(receiver);
            helper.setSubject(subject);
            helper.setText(body);
            sender.send(message);
            
            EmailEntity emailEntity = new EmailEntity();
            emailEntity.setReceiveremail(receiver);
            emailEntity.setSubject(subject);
            emailEntity.setBody(body);
            repo.save(emailEntity);
            return "Email sent successfully to " + receiver;
        } catch (MessagingException e) {
            e.printStackTrace();
            return "Failed to send email to " + receiver;  
        }
    }
}

