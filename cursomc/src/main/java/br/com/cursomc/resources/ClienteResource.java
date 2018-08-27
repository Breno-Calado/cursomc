package br.com.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cursomc.domain.Cliente;
import br.com.cursomc.services.ClienteService;

@RestController
@RequestMapping(value="/Clientes")
public class ClienteResource {

	@Autowired
	private ClienteService ClienteService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Cliente obj = ClienteService.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

}
