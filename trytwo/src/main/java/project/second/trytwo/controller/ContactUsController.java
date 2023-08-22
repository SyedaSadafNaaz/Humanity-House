package project.second.trytwo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.second.trytwo.entity.ContactUsENTITY;
import project.second.trytwo.service.contactUsService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/contactus")
public class ContactUsController {
	
	@Autowired
	contactUsService contactusservice;
	
	@PostMapping("/addmessage")
	public boolean addMessage(@RequestBody ContactUsENTITY objcontact)
	{
		return contactusservice.addMessage(objcontact);
	}
	
	

}
