package br.com.dominio.s06;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		// variaveis
		int num1;
		Scanner teclado = new Scanner(System.in);
		//entradas
		System.out.println("Insira um numero: ");
		num1 = teclado.nextInt();
		//processamento
		if (num1 > 100) {
			System.out.println("O Valor é: " + num1);
		}else {
			System.out.println("O Valor é: 0");
		}
		teclado.close();

	}

}
