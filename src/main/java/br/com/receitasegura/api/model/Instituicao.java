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
@Table(name = "PB_INSTITUICAO", schema = "PUBLIC")
@Getter
@Setter
@AllArgsConstructor
public class Instituicao extends Sequencial implements Serializable {

	private static final long serialVersionUID = 1181232552227809247L;
	
	@Column(length = 13, nullable = false)
	private String cnpj;

	@Column(nullable = false)
	private String razaoSocial;
	
	@Column(nullable = false)
	private Endereco enderecoFk;
	
	@Column(length = 10, nullable = true)
	private String numeroEndereco;

	@Column(length = 50, nullable = true)
	private String complemento;

}
