package com.therealdanvega.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.therealdanvega.domain.User;
import com.therealdanvega.service.NotificationService;

@RestController
public class RegistrationController {
	

	@Autowired
	private NotificationService notificationService;


	
	@RequestMapping("/success")
	public String signupSuccess(){
		
		// create user (здесь нужно запихать статистику)
		User user = new User();

		
		// send a notification
		try {
			notificationService.sendNotificaitoin(user);
		}catch( MailException e ){
			// catch error
			System.err.println("Error Sending Email: " + e.getMessage());
		}
		
		return "Thank you";
	}
	
}
