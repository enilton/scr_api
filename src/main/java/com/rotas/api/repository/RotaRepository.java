package com.rotas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rotas.api.models.Rota;

public interface RotaRepository extends JpaRepository<Rota, Long>{

	Rota findById(long id);
	
}
