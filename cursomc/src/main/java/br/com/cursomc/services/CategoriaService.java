package br.com.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursomc.dao.CategoriaDAO;
import br.com.cursomc.domain.Categoria;
import br.com.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaDAO categoriaDAO;

	// Método de busca para quem esta usando o spring 2.x.x

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = categoriaDAO.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

}
