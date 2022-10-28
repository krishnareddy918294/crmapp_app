package com.crm.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.LeadRepository.ContactRepository;
import com.crm.entities.Contact;

@Service
public class ContactServiceimpl implements ContactService {

	
	
	@Autowired
	private ContactRepository contactRepo;
	@Override
	public void saveContact(Contact contact) {
contactRepo.save(contact);
	}
	@Override
	public List<Contact> getAllcontacts() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}
	@Override
	public Contact findbyid(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact1 = findById.get();
		return contact1;
	}
	

}
