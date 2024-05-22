package com.concessionaria;

import java.util.ArrayList;
import java.util.Scanner;

public class MainGambiarra {

//	public static void main(String[] args) {
//		ArrayList<User> users = new ArrayList<>();
//		boolean conectado = false;
//
//		criaUsuarios(users);
//
//		int resultado = exibeMenuInicial();
//
//		int opcaoEscolhida = resultado;
//		while (opcaoEscolhida != 0){
//			if (opcaoEscolhida == 1){
//				User usuarioAtual = loga(users);
//
//				opcaoEscolhida = exibeMenuLogado(users, usuarioAtual, opcaoEscolhida);
//
//				if (opcaoEscolhida == 2){
//					transfere(usuarioAtual, users);
//
//					opcaoEscolhida = opcaoMenu(usuarioAtual, users);
//				}
//			}
//		}
//	}

//	public static int opcaoMenu(User usuarioAtual, ArrayList<User> users){
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("0 que deseja fazer? 0. Sair  2. Outra transferencia");
//		int resultado = scanner.nextInt();
//
//		if (resultado == 2){
//			transfere(usuarioAtual, users);
//		}
//
//		return desconecta(resultado);
//	}

	public static int exibeMenuInicial(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem vindo, o que deseja fazer? 1. Logar  2. Sair");
		int resultado = scanner.nextInt();

		return resultado;
	}

	public static User loga(ArrayList<User> users){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o username: ");
		String username = scanner.nextLine();

		System.out.println("Digite sua senha: ");
		String senha = scanner.nextLine();

		for (User usuarioAtual : users){
			if (usuarioAtual.getNome().equals(username) && usuarioAtual.getSenha().equals(senha)){

				return usuarioAtual;
			}
		}

		return null;
	}

	public static boolean conectaConta(ArrayList<User> users, User usuarioAtual) {
		boolean conectado = false;

		if (usuarioAtual != null){
			return conectado = true;
		}
		return conectado;
	}

//	public static int exibeMenuLogado (ArrayList<User> users, User usuarioAtual, int opcaoEscolhida){
//		Scanner scanner = new Scanner(System.in);
//
//		if (usuarioAtual.isAdmin()){
//			System.out.println("Bem vindo Adm");
//			System.out.println("O que deseja fazer? 1. Transferir 2. Sair");
//			int resultado = scanner.nextInt();
//
//			if (resultado == 1){
//				return 2;
//			}
//		}
//		else {
//
//			System.out.println("Bem vindo usuario, o que deseja fazer?");
//			System.out.println("1. sair  2. nao sair");
//			int resultado = scanner.nextInt();
//
//			if (resultado == 1){
//				desconecta(opcaoEscolhida);
//			}
//
//			if (resultado == 2){
//				System.out.println("Vai sair mesmo assim");
//				desconecta(opcaoEscolhida);
//			}
//		}
//		return 0;
//
//	}

	public static int desconecta(int opcaoEscolhida){
		System.out.println("Desconectando");

		return 0;
	}

//	public static void criaUsuarios (ArrayList<User> users){
//
//		String nomeDoPrimeiroUsuario = "valdeciro";
//
//		String senhaDoPrimeiroUsuario = "123";
//
//		double dinheiroDoPrimeiroUsuario = 10.00;
//
//		User user = new User(nomeDoPrimeiroUsuario, senhaDoPrimeiroUsuario, dinheiroDoPrimeiroUsuario);
//
//		String nomeDoSegundoUsuario = "valdeclei";
//
//		String senhaDoSegundoUsuario = "123";
//
//		double dinheiroDoSegundoUsuario = 10.00;
//
//		User user2 = new User(nomeDoSegundoUsuario, senhaDoSegundoUsuario, dinheiroDoSegundoUsuario);
//
//		String nomeDoTerceiroUsuario = "valdemar";
//
//		String senhaDoTerceiroUsuario = "123";
//
//		double dinheiroDoTerceiroUsuario = 10.00;
//
//		boolean isAdmin = true;
//
//		User user3 = new User(nomeDoTerceiroUsuario, senhaDoTerceiroUsuario, dinheiroDoTerceiroUsuario, isAdmin);
//
//		users.add(user);
//		users.add(user2);
//		users.add(user3);
//	}

//	public static void transfere(User user, ArrayList<User> users){
//		Scanner scanner = new Scanner(System.in);
//
//		if (user.isAdmin()){
//			System.out.println("Digite o nome do usuario que receberá: ");
//			String usuarioAhReceber = scanner.nextLine();
//
//			System.out.println("Digite o valor da transferencia: ");
//			double valorDaTransferencia = scanner.nextInt();
//
//			for (User usuarioAtual : users){
//				if (usuarioAtual.getNome().equals(usuarioAhReceber) && user.getDinheiro() <= valorDaTransferencia && valorDaTransferencia > 0){
//
//					user.setDinheiro(user.getDinheiro() - valorDaTransferencia);
//					usuarioAtual.setDinheiro(usuarioAtual.getDinheiro() + valorDaTransferencia);
//
//					System.out.println("Seu saldo agora é: " + user.getDinheiro());
//					System.out.println("Saldo do meninao agora é: " + usuarioAtual.getDinheiro());
//				}
//			}
//		}
//	}


}


