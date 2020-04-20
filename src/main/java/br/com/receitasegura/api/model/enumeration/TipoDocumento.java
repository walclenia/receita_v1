package br.com.receitasegura.api.model.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoDocumento {
	
	RECEITA_SIMPLES ("Receita Simples"),
	RECEITA_CONTROLADA ("Receita Controlada"),
	BLOQUEADO ("Bloqueado");
	
	private String tipoDocumento;

}
