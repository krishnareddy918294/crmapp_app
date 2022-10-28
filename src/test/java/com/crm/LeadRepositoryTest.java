package com.crm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.crm.LeadRepository.LeadRepository;
import com.crm.entities.Lead;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
public class LeadRepositoryTest {
	
	@Autowired
	private LeadRepository leadRepo;
	
	@Test
	public void saveOneLead() {
		Lead save=new Lead("bala1", "krishan1", "balakrishnareddy9182@gmail.com", "radio1", "9182945053");
		leadRepo.save(save);
	}

}
