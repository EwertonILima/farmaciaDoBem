package org.generation.farmaciaAPI.repository;

import java.util.List;

import org.generation.farmaciaAPI.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByNomeContainingIgnoreCase(String nome);
}
