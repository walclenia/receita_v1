package br.com.receitasegura.api.model.common;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import br.com.receitasegura.api.model.Endereco;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class Pessoa extends Sequencial {

	@Column(nullable = false)
	private String nome;
	
	@Column(length = 11, nullable = false)
	private String cpf;
	
	@Column(nullable = true)
	private String rg;

	@Column(nullable = false)
	private Endereco endereco;

}
