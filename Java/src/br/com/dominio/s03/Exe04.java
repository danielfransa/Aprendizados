package br.com.dominio.s03;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		// variaveis
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in);
		
		// entradas
		System.out.println("Insira o 1º numero: ");
		num1 = teclado.nextInt();
		System.out.println("Insira o 2º numero: ");
		num2 = teclado.nextInt();
		
		//processamento
		soma = num1 + num2;
		
		//saida
		System.out.println("O resultado é: " +soma);
		teclado.close();
	}

}
