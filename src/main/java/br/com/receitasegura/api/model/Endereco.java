package br.com.receitasegura.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.receitasegura.api.model.common.Sequencial;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PB_ENDERECO", schema = "PUBLIC")
@Getter
@Setter
@AllArgsConstructor
public class Endereco extends Sequencial implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(length = 150, nullable = false)
	private String logradouro;

	@Column(length = 100, nullable = false)
	private String bairro;

	@Column(length = 100, nullable = false)
	private String cidade;

	@Column(length = 2, nullable = false)
	private String uf;

	@Column(length = 8, nullable = false)
	private String cep;

}
