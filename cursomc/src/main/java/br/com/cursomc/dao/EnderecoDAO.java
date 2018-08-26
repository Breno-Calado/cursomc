package br.com.cursomc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursomc.domain.Endereco;;;

@Repository
public interface EnderecoDAO extends JpaRepository<Endereco, Integer> {

}
