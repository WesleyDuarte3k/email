package com.concessionaria;

public class Email {
	private String remetente;
	private String destinatario;
	private String titulo;
	private String conteudo;

	public Email(String remetente, String destinatario, String titulo, String conteudo) {
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.titulo = titulo;
		this.conteudo = conteudo;
	}

	@Override
	public String toString() {
		return "Email { " +
			"Remetente = '" + remetente + '\n' +
			"\n Destinatario = '" + destinatario + '\n' +
			"\n Titulo = '" + titulo + '\n' +
			"\n Conteudo = \n '" + conteudo + '\n' ;
	}
}
