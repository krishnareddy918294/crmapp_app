package com.crm.LeadRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.entities.Contact;
import com.crm.entities.Lead;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
