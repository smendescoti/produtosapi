package br.com.cotiinformatica.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@Column(name = "id")
	private UUID id;

	@Column(name = "nome", length = 50, nullable = false, unique = true)
	private String nome;

	@ManyToMany(mappedBy = "categorias")
	private List<Produto> produtos;

}
