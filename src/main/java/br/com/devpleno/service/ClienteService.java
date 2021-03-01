package br.com.devpleno.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devpleno.domain.Cliente;
import br.com.devpleno.repository.ClienteRepository;
import br.com.devpleno.service.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente findById(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado Id: " + id + " Tipo: " + Cliente.class.getName()));
	}
	
	public Cliente insert(Cliente cliente) {
		return repo.save(cliente);
	}
	
	

}
