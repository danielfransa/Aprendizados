package br.com.dominio.s08;

import java.util.Scanner;

public class Exe04b {

	public static void main(String[] args) {
		// variaveis
				int[] vetor1 = new int[20];
				int soma = 0;
				Scanner teclado = new Scanner(System.in);
				
				//entrada
				for (int i = 0; i < 20; i++) {
					System.out.printf("Informe o valor para o vetor %d/20\n", (i+1));
					vetor1[i] = teclado.nextInt();
					soma = (soma + vetor1[i]);
				}
				System.out.printf("A soma é %d", soma);
				
				teclado.close();

	}

}
