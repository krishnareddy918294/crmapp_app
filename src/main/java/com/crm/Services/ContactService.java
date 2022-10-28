package com.crm.Services;

import java.util.List;

import com.crm.entities.Contact;

public interface ContactService {
	
	public void saveContact(Contact contact);

	public List<Contact> getAllcontacts() ;
		
	

	public Contact findbyid(long id);


}
