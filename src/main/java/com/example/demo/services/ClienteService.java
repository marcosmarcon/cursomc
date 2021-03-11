package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Cliente;
import com.example.demo.repositories.ClienteRepository;
import com.example.demo.services.exceptions.ObjectNotFoundException;

import java.util.Optional;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	//Se usar spring 2 vai funcioanr dessa forma, 
	//assim sendo sempre que buscar pelo id tem que fazer dessa forma
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
	
}
