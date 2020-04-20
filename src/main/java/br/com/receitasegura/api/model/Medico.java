package br.com.receitasegura.api.model;

import javax.persistence.Column;

import br.com.receitasegura.api.model.common.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Medico extends Pessoa {

	@Column(length = 10, nullable = false, unique = true)
	private String crm;

	@Column(nullable = false)
	private Especialidade especialidade;
	
	@Column(nullable = false)
	private Instituicao lotacao;
	
	
}
