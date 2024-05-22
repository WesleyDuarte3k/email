package com.concessionaria;

import java.util.ArrayList;

public class User {
	private String nome;
	private String senha;
	private String endereçoDeEmail;
	private CaixaDeEntrada caixaDeEntrada;

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public String getEndereçoDeEmail() {
		return endereçoDeEmail;
	}

	public CaixaDeEntrada getCaixaDeEntrada() {
		return caixaDeEntrada;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public User(String nome, String senha, String endereçoDeEmail) {
		this.nome = nome;
		this.senha = senha;
		this.endereçoDeEmail = endereçoDeEmail;
		this.caixaDeEntrada = new CaixaDeEntrada(endereçoDeEmail);
	}
}
