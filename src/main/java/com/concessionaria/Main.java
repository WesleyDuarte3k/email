package com.concessionaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static User usuarioLogado;
	public static ArrayList<User> users = new ArrayList<>();
	public static void main(String[] args) {

		criaUsuarios(users);

		usuarioLogado = iniciaSessao(users);
		escreveEmailInicial(usuarioLogado);
		while (usuarioLogado != null){
			exibeMenuOnline(usuarioLogado, users);

			if (usuarioLogado == null){
				usuarioLogado = iniciaSessao(users);
			}
		}
	}

	public static User iniciaSessao(ArrayList<User> users) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. login automatico  2. login manual");
		int resultado = scanner.nextInt();

		if (resultado == 1) {
			return usuarioLogado = loga(users);
		}
		if (resultado == 2) {
			return usuarioLogado = loginManual(users);
		}
		return null;
	}

	public static User loginManual(ArrayList<User> users){
		Scanner scanner = new Scanner(System.in);

		System.out.println("nome: ");
		String nome = scanner.nextLine();

		for (User usuarioAtual : users){
			if (usuarioAtual.getNome().equals(nome)){
				return usuarioAtual;
			}
		}
		return null;
	}


	public static void criaUsuarios (ArrayList<User> users){

		String nomeDoPrimeiroUsuario = "valdeciro";

		String senhaDoPrimeiroUsuario = "123";

		String emailDoPrimeiroUsuario = "valdeciro@wmail.com";


		String nomeDoSegundoUsuario = "valdeclei";

		String senhaDoSegundoUsuario = "123";

		String emailDoSegundoUsuario = "valdeclei@wmail.com";


		String nomeDoTerceiroUsuario = "valdemar";

		String senhaDoTerceiroUsuario = "123";

		String emailDoTerceiro = "valdemar@wmail.com";

		User userUm = new User(nomeDoPrimeiroUsuario, senhaDoPrimeiroUsuario, emailDoPrimeiroUsuario);
		User userDois = new User(nomeDoSegundoUsuario, senhaDoSegundoUsuario, emailDoSegundoUsuario);
		User userTres = new User(nomeDoTerceiroUsuario, senhaDoTerceiroUsuario, emailDoTerceiro);

		users.add(userUm);
		users.add(userDois);
		users.add(userTres);
	}

	public static User loga(ArrayList<User> users){
		System.out.print("Nome: ");
		String nome = "valdemar";

		System.out.print("Senha: ");
		String senha = "123";

		for (User usuarioAtual : users) {
			if (usuarioAtual.getNome().equals(nome) && usuarioAtual.getSenha().equals(senha)){
				return usuarioAtual;
			}
		}
		return null;
	}
	public static User desloga(){
		System.out.println("Desconectando...");
		return null;
	}


	public static boolean contaEstaConectada(User user){
		if (user != null){
			return true;
		}
		return false;
	}

	public static void exibeMenuOnline(User user, ArrayList<User> users){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem vindo: " + user.getNome());

		System.out.println("1. caixa de entrada  2. sair : ");
		int resultado = scanner.nextInt();

		if (resultado == 1){
			System.out.println("1. E-mails enviados  2. E-mails recebidos  3. Escrever novo e-mail");
			int resultadoCaixa = scanner.nextInt();

			if (resultadoCaixa == 1){
				exibeEmailsEnviados(user);
			}

			if (resultadoCaixa == 2){
				exibeEmailsRecebidos(user);
			}

			if (resultadoCaixa == 3){
				escreveEmail(user);
			}
		}

		if (resultado == 2){
			usuarioLogado = desloga();
		}
	}

	public static void alteraSenha(User user){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a nova senha: ");
		String novaSenha = scanner.nextLine();

		user.setSenha(novaSenha);
	}

	public static void exibeEmailsEnviados(User user){
		System.out.println("Emails enviados");
		System.out.println(user.getCaixaDeEntrada().obtemEmailsEnviados().toString());
	}

	public static void exibeEmailsRecebidos(User user){
		System.out.println("Emails recebidos");
		System.out.println(user.getCaixaDeEntrada().obtemEmailsRecebido());

	}

	public static void escreveEmail(User user){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Destinatario: ");
		String destinatario = scanner.nextLine();

		System.out.println("Assunto :");
		String assunto = scanner.nextLine();

		System.out.println("Escreva a mensagem: ");
		String conteudo = scanner.nextLine();


		user.getCaixaDeEntrada().escreveEmail(destinatario, assunto, conteudo);
	}

	public static void escreveEmailInicial(User user){
//		String destinatario = "valdemar@wmail.com";
//		String assunto = "Nova musica";
//		String conteudo = "Por que que cê quebrou meu coração?\n" +
//			"Deixou sem rumo e sem direção\n" +
//			"Quando ela me teve na sua mão\n" +
//			"E ainda ficou com a minha pior versão\n" +
//			"Me acertou com jeito, a porra do meu peito\n" +
//			"Eu tinha mil defeitos não ia me entregar\n" +
//			"O que que eu faço agora?\n" +
//			"Pois sempre que te olho, com esse sorriso lindo\n" +
//			"Que não pode parar\n" +
//			"Você me chamando pra dar um rolê\n" +
//			"No seu mundo, só não ia porque já sofri e vivi de tudo\n" +
//			"Meu mundo perdeu suas cores\n" +
//			"Pro amor, nem tudo são flores\n" +
//			"Tô contando dos meus amores\n" +
//			"Dos meus amores\n" +
//			"Tô contando dos meus amores\n" +
//			"Meu mundo perdeu suas cores\n" +
//			"Pro amor, nem tudo são flores\n" +
//			"Tô contando dos meus amores\n" +
//			"Dos meus amores\n" +
//			"Tô contando dos meus amores"  ;
//
//		user.getCaixaDeEntrada().escreveEmail(destinatario, assunto, conteudo);
	}


}
