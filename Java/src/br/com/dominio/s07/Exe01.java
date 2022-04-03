package br.com.dominio.s07;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		// Variaveis
		int n, maior = 0;
		Scanner teclado = new Scanner(System.in);

		
		//entradas
		System.out.println("Informe um número: ");
		n = teclado.nextInt();
		
		//processamento
		while(n != 0) {
			if(n > maior) {
				maior = n;
			}
			System.out.println("Informe um número: ");
			n = teclado.nextInt();
		}
		System.out.println("O maior número é: " + maior);
		
		teclado.close();
	}

}
