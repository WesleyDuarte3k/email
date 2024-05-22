package com.concessionaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static User usuarioLogado;
	public static ArrayList<User> users = new ArrayList<>();

	public static void main(String[] args) {

		criaUsuarios(users);

		CaixaDeEntrada caixa = new CaixaDeEntrada();

		usuarioLogado = loga(users);

		while (usuarioLogado != null){

			exibeMenuOnline(usuarioLogado, users);
		}

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

		String emailDoTerceiro = "valdeclei@gmail.com";

		User user = new User(nomeDoPrimeiroUsuario, senhaDoPrimeiroUsuario, emailDoPrimeiroUsuario);
		User user2 = new User(nomeDoSegundoUsuario, senhaDoSegundoUsuario, emailDoSegundoUsuario);
		User user3 = new User(nomeDoTerceiroUsuario, senhaDoTerceiroUsuario, emailDoTerceiro);

		users.add(user);
		users.add(user2);
		users.add(user3);
	}

	public static User loga(ArrayList<User> users){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Username: ");
		String username = scanner.nextLine();

		System.out.println("Senha");
		String senha = scanner.nextLine();

		for (User usuarioAtual : users) {
			if (usuarioAtual.getNome().equals(username) && usuarioAtual.getSenha().equals(senha)){

				return usuarioAtual;
			}
		}

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

		System.out.println("1. transferir  2. alterar senha  3. sair : ");
		int resultado = scanner.nextInt();
	}

	public static void alteraSenha(User user){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a nova senha: ");
		String novaSenha = scanner.nextLine();

		user.setSenha(novaSenha);
	}
}
