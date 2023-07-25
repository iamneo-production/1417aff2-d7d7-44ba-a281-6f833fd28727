package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Bank;
import com.example.demo.Repo.BankRepo;
@Service
public class ApiService {
	@Autowired //extends another class
	BankRepo stRepo; //reference variable
	
	public Bank saveDetails(Bank st1) {
		return stRepo.save(st1);
	}
	public List <Bank>getDetails()

{
		return stRepo.findAll();
		
}
	public Bank UpdateDetails(Bank e1)
	{
		return stRepo.saveAndFlush(e1);
	}
	
	public void deleteDetails (int id)
	{		
	
	    stRepo.deleteById(id);	
	
	}
}



