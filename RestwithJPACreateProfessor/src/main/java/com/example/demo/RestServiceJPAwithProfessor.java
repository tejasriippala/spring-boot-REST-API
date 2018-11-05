package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServiceJPAwithProfessor {
	
	@Autowired
	private ServiceLayer sl;
	
	@RequestMapping(value="/getdataobjectofProfessor/{ID}",method=RequestMethod.GET)
	public Optional<Professor> getProf(@PathVariable("ID") Integer ID) {
		
		return sl.getProfessor(ID);
	}
	
}
