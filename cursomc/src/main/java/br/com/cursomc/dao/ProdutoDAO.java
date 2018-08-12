package br.com.cursomc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursomc.domain.Produto;

@Repository
public interface ProdutoDAO extends JpaRepository<Produto, Integer> {

}
