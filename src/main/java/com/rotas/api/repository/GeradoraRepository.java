package com.rotas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rotas.api.models.Geradora;

//@Service(value="GeradoraRepository") 
public interface GeradoraRepository extends JpaRepository<Geradora, Long>{

	Geradora findById(long id);
}
