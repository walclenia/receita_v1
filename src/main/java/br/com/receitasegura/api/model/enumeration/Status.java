package br.com.receitasegura.api.model.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
	
	ATIVO ("Ativo"),
	BLOQUEADO ("Bloqueado");
	
	private String status;

}
