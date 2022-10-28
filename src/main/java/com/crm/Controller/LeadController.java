package com.crm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.Services.LeadService;
import com.crm.entities.Lead;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadservice;
	
	@RequestMapping("/viewleading")
	public String viewLeading() {
		return "save_lead";
	}
	@RequestMapping("/savelead")
	public String saveLead(Lead lead,ModelMap model) {
		leadservice.saveLead(lead);
		model.addAttribute("lead",lead);
		return "lead_info";
		
	}
	@RequestMapping("/listAll")
	public String getLeads(ModelMap model) {
		List<Lead> leads = leadservice.getAllLeads();
		 model.addAttribute("leads",leads);
		 return "leads_result";
	}
	@RequestMapping("getLeadById")
	public String getLeadByid(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadservice.findbyId(id);
		model.addAttribute("lead",lead);
		return "lead_info";

	}
		
	
}
