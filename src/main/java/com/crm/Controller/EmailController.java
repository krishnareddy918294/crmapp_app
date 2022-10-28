package com.crm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.utility.EmailService;

@Controller
public class EmailController {

	@Autowired
	private EmailService emailservice;
	
	
	@RequestMapping("/sendEmail")
	public String SendEmailing(@RequestParam("email")String email,ModelMap model) {
		model.addAttribute("to",email);
		return "compose_email";
	}
	@RequestMapping("/send")
	public String sending(@RequestParam("to")String to,@RequestParam("sub") String sub,@RequestParam("message") String message,ModelMap model) {
		emailservice.sendSimpleMessage(to, sub, message);
		model.addAttribute("msg","emailSending is successful");
		return "compose_email";
	}

}
