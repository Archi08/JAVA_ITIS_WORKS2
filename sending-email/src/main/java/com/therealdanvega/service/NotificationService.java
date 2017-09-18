package com.therealdanvega.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.therealdanvega.domain.User;

@Service
public class NotificationService {

	private JavaMailSender javaMailSender;
	
	@Autowired
	public NotificationService(JavaMailSender javaMailSender){
		this.javaMailSender = javaMailSender;
	}
	
	public void sendNotificaitoin(User user) throws MailException {
		// send email
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo("shaihutdinov.art@gmail.com");
		mail.setFrom("shaihutdinov.art@gmail.com");
		mail.setSubject("Toys for Shots is coming soon!");
		//метод, который отоборжает само сообщение, можно сам объект сюда запихать
		mail.setText("Дороу");
		
		javaMailSender.send(mail);
	}
	
}
