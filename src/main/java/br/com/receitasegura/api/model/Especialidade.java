package br.com.receitasegura.api.model;

import javax.persistence.Entity;

import br.com.receitasegura.api.model.common.Sequencial;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "PB_ESPECIALIDADE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Especialidade extends Sequencial {

	private String nomeEspecialidade;
	
}
