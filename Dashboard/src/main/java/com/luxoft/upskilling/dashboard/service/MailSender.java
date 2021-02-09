package com.luxoft.upskilling.dashboard.service;

import com.luxoft.upskilling.dashboard.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class MailSender {

    @Value("${spring.mail.username}")
    private String username;


    private JavaMailSender javaMailSender;

    @Autowired
    public MailSender(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendPasswordToNewUser(User user) throws MailException {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(username);
        mailMessage.setTo(user.getEmail());
        mailMessage.setSubject("Welcome on board");
        mailMessage.setText(" "); //TODO use Class CreatePassword

        javaMailSender.send(mailMessage);


    }
}
