package br.com.dominio.s07;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		//variaveis
		String nome, senha;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Informe o nome do usuário: ");
		nome = teclado.next();
		System.out.println("Informe a senha: ");
		senha = teclado.next();
		
		// processamento
		while (nome.equals(senha)) {
			System.out.println("Nome do Usuário deve ser diferente da Senha:");
			System.out.println("Informe o nome do usuário: ");
			nome = teclado.next();
			System.out.println("Informe a senha: ");
			senha = teclado.next();
			
		}
		System.out.println("Usuário e Senha cadastrado com Sucesso!");
		teclado.close();
	}

}
