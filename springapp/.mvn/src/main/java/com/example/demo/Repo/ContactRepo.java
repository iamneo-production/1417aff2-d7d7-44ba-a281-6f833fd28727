package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Model.Contact;
public interface ContactRepo extends JpaRepository<Contact,Integer>{

}