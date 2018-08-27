package br.com.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursomc.dao.ClienteDAO;
import br.com.cursomc.domain.Cliente;
import br.com.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteDAO clienteDAO;

	// Método de busca para quem esta usando o spring 2.x.x

	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = clienteDAO.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}
