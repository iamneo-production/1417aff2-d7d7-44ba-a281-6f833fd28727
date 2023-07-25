package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.login;
import com.example.demo.Repo.loginRepo;
@Service
public class loginService {
	@Autowired //extends another class
	loginRepo stRepo; //reference variable
	
	public login savelogin(login a) {
		return stRepo.save(a);
	}
	public List <login>getlogin()

{
		return stRepo.findAll();
		
}
	public login Updatelogin(login a1)
	{
		return stRepo.saveAndFlush(a1);
	}
	
	public void deleteLogin(int id)
	{		
	
	    stRepo.deleteById(id);	
	
	}
}



