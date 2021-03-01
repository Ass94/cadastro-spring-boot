package br.com.devpleno.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devpleno.domain.Cliente;
import br.com.devpleno.repository.ClienteRepository;

@Service
public class DBService {
	
	@Autowired
	private ClienteRepository repo;
	
	public void inicializarTesteDataBase() {
		
		Cliente cliente = new Cliente(null, "Alex", "alex94tu@gmail.com");
		repo.saveAll(Arrays.asList(cliente));
		
		
	}

}
