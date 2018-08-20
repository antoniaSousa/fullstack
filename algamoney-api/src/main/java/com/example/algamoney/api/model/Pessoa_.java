package com.example.algamoney.api.model;

import javax.persistence.metamodel.SingularAttribute;

public class Pessoa_ {
	public static volatile SingularAttribute<Pessoa, Long> codigo;
	public static volatile SingularAttribute<Pessoa, Boolean> ativo;
	public static volatile SingularAttribute<Pessoa, Endereco> endereco;
	public static volatile SingularAttribute<Pessoa, String> nome;

}
