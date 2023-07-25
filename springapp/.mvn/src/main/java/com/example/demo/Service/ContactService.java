package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Contact;
import com.example.demo.Repo.ContactRepo;
@Service
public class ContactService {
	@Autowired //extends another class
	ContactRepo stRepo; 
	
	public Contact savecontact(Contact c) {
		return stRepo.save(c);
	}
	public List <Contact>getcontact()

{
		return stRepo.findAll();
		
}
	public Contact Updatecontact(Contact c1)
	{
		return stRepo.saveAndFlush(c1);
	}
	
	public void deleteContact (int id)
	{		
	
	    stRepo.deleteById(id);	
	
	}
}




