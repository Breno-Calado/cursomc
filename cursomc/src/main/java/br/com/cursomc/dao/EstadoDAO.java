package br.com.cursomc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursomc.domain.Estado;

@Repository
public interface EstadoDAO extends JpaRepository<Estado, Integer> {

}
