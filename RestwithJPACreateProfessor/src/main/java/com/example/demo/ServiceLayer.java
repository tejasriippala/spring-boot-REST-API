package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServiceLayer {
	
	@Autowired
	private ProfessorInterface pi;
	
	public Optional<Professor> getProfessor(Integer ID) {
		return pi.findById(ID);		
	}


}
