package br.com.dominio.s07;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		//variaveis
		int mult, numero;
		
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("Informe um número: ");
		numero = teclado.nextInt();
		//processamento
		for (int i = 1; i <= 10; i++) {
			 mult = numero * i;
			 System.out.printf("%d X %d = %d \n", numero, i, mult);
						
		}
		teclado.close();
	}

}
