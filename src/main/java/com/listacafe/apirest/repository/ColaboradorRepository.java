package com.listacafe.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.listacafe.apirest.models.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Integer>{
	
	Colaborador findById(long id);

	

	
	
	

}
