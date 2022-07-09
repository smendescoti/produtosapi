package br.com.cotiinformatica.responses;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FornecedorGetResponse {

	private Integer idFornecedor;
	private String nome;
	private String cnpj;
	
}
