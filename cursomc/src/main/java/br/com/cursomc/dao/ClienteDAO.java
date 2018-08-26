package br.com.cursomc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursomc.domain.Cliente;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

}
