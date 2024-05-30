package com.br.api.v1.model;

import com.br.domain.model.Cidade;
import com.br.domain.model.Estado;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoModel {
	
	private String cep;
	private Cidade cidade;
}
