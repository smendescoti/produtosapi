package br.com.cotiinformatica.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.cotiinformatica.entities.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria, UUID> {

	@Query("select c from Categoria c where c.nome = :nome")
	Categoria findByNome(@Param("nome") String nome);
}
