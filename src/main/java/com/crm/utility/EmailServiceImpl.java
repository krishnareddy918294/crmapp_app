package com.crm.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;


@Component
public class EmailServiceImpl implements EmailService {

	@Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(String to, String sub, String message) {
     
       
        SimpleMailMessage message1 = new SimpleMailMessage(); 
        message1.setTo(to); 
        message1.setSubject(sub); 
        message1.setText(message);
        emailSender.send(message1);
        
    }
    }
