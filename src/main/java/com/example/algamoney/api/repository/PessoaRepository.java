package com.example.algamoney.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
	List<Pessoa> findAllByAtivo(Boolean ativo);

}
