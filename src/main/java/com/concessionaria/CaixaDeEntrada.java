package com.concessionaria;

import java.util.ArrayList;
import java.util.Scanner;

public class CaixaDeEntrada {

	private String enderecoDeEmail;
	private final ArrayList<Email> emailsEnviados = new ArrayList<>();
	private final ArrayList<Email> emailsRecebidos = new ArrayList<>();

	public void escreveEmail(String destinatario, String assunto, String conteudo) {
		Email email = new Email(enderecoDeEmail, destinatario, assunto, conteudo);

		emailsEnviados.add(email);

		for (User userAtual : Main.users){
			if (userAtual.getEndereçoDeEmail().equals(destinatario)){
				userAtual.getCaixaDeEntrada().recebe(email);
				break;
			}
		}
	}

	public void recebe(Email email){
		emailsRecebidos.add(email);
	}

	public ArrayList<Email> obtemEmailsRecebido(){
		return emailsRecebidos;
	}

	public CaixaDeEntrada(String enderecoDeEmail) {
		this.enderecoDeEmail = enderecoDeEmail;
	}

	public ArrayList<Email> obtemEmailsEnviados(){
		return emailsEnviados;
	}
}

