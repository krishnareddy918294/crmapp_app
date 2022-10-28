package com.crm.Services;

import java.util.List;

import com.crm.entities.Lead;

public interface LeadService {
public void saveLead(Lead lead);
public List<Lead> getAllLeads();
public Lead findbyId(long id);
public void deleteByid(long id);
	

}
