package com.example.demo.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "categoria") 
public class CategoriaResources {
	
	@RequestMapping(method=RequestMethod.GET) 
	public String listar() {
		return "rest funfando";
	}

}
