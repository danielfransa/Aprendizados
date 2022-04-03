package br.com.dominio.s08;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		// variaveis
		int[] vetor1 = new int[20];
		int soma = 0;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		for (int i = 0; i < 20; i++) {
			System.out.println("Informe o valor para o vetor: ");
			vetor1[i] = teclado.nextInt();
			soma = (soma + vetor1[i]);
		}
		System.out.println(soma);
		
		teclado.close();
	}
	

}
