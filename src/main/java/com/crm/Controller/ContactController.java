package com.crm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.IsolationLevelDataSourceAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.Services.ContactService;
import com.crm.Services.LeadService;
import com.crm.entities.Contact;
import com.crm.entities.Lead;

@Controller
public class ContactController {

	
	@Autowired
	private LeadService leadService;
	@Autowired
	private ContactService contactservice;
	
	@RequestMapping("/contacttocontact")
	public String converttoContact(@RequestParam("id")long id,ModelMap model)
	{
		Lead lead = leadService.findbyId(id);
		Contact contact1=new  Contact();
		contact1.setFirstName(lead.getFirstName());
		contact1.setLastName(lead.getLastName());
		contact1.setEmail(lead.getEmail());
		contact1.setLeadSource(lead.getLeadSource());
		contact1.setMobile(lead.getMobile());
		
		contactservice.saveContact(contact1);
		leadService.deleteByid(id);
		List<Contact> contact = contactservice.getAllcontacts();
		model.addAttribute("contact",contact);
		return "contact_result";
	}
	@RequestMapping("/listAllContacts")
	public String listallcontacts(ModelMap model) {
	List<Contact> contact = contactservice.getAllcontacts();
	model.addAttribute("contact",contact);
	return "contact_result";
}
	@RequestMapping("/getcontactId")
	public String getcontactid(@RequestParam("id") long id,ModelMap model) {
		Contact contacts=contactservice.findbyid(id);
		model.addAttribute("contacts",contacts);
		return "contact_info";
	}
	//getidByBillings
	
	@RequestMapping("getidByBillings")
	public String letdoBillings(@RequestParam("id")long id,ModelMap model) {
		Contact contacts=contactservice.findbyid(id);
		model.addAttribute("contacts",contacts);
		return "Billing_info";	
		}
	
	
	
}
