package com.example.algamoney.api.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.metamodel.SingularAttribute;

public class Lancamento_ {
	public static volatile SingularAttribute<Lancamento, Long> codigo;
	public static volatile SingularAttribute<Lancamento, String> observacao;
	public static volatile SingularAttribute<Lancamento, TipoLancamento> tipo;
	public static volatile SingularAttribute<Lancamento, LocalDate> dataPagamento;
	public static volatile SingularAttribute<Lancamento, Pessoa> pessoa;
	public static volatile SingularAttribute<Lancamento, LocalDate> dataVencimento;
	public static volatile SingularAttribute<Lancamento, Categoria> categoria;
	public static volatile SingularAttribute<Lancamento, BigDecimal> valor;
	public static volatile SingularAttribute<Lancamento, String> descricao;

}
