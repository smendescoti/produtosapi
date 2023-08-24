package br.com.cotiinformatica.data;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.cotiinformatica.entities.Categoria;
import br.com.cotiinformatica.repositories.ICategoriaRepository;

@Component
public class LoadData implements ApplicationRunner {

	@Autowired
	ICategoriaRepository categoriaRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Categoria informatica = categoriaRepository.findByNome("INFORMÁTICA");
		if (informatica == null) {
			informatica = new Categoria();
			informatica.setId(UUID.randomUUID());
			informatica.setNome("INFORMÁTICA");
			categoriaRepository.save(informatica);
		}

		Categoria eletronicos = categoriaRepository.findByNome("ELETRÔNICOS");
		if (eletronicos == null) {
			eletronicos = new Categoria();
			eletronicos.setId(UUID.randomUUID());
			eletronicos.setNome("ELETRÔNICOS");
			categoriaRepository.save(eletronicos);
		}

		Categoria games = categoriaRepository.findByNome("GAMES");
		if (games == null) {
			games = new Categoria();
			games.setId(UUID.randomUUID());
			games.setNome("GAMES");
			categoriaRepository.save(games);
		}

		Categoria livraria = categoriaRepository.findByNome("LIVRARIA");
		if (livraria == null) {
			livraria = new Categoria();
			livraria.setId(UUID.randomUUID());
			livraria.setNome("LIVRARIA");
			categoriaRepository.save(livraria);
		}

		Categoria diversos = categoriaRepository.findByNome("DIVERSOS");
		if (diversos == null) {
			diversos = new Categoria();
			diversos.setId(UUID.randomUUID());
			diversos.setNome("DIVERSOS");
			categoriaRepository.save(diversos);
		}
	}

}
