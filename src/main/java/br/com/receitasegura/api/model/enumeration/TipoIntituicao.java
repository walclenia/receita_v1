package br.com.receitasegura.api.model.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoIntituicao {
	
	GOVERNO ("Governo"),
	CONSELHO_CLASSE ("Conselho de Classe");
	
	private String tipoInstituicao;

}
