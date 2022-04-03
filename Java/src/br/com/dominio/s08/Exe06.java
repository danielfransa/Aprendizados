package br.com.dominio.s08;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		//variaveis
		float[] vetor = new float[5];
		int codigo;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Informe o código: ");
		codigo = teclado.nextInt();
		
		if(codigo != 0 && codigo <= 2) {
			for (int i = 0; i < vetor.length; i++) {
				System.out.println("Informe um número real: ");
				vetor[i] = teclado.nextFloat();
			}
			if(codigo == 1) {
				for (int i = 0; i < vetor.length; i++) {
					System.out.println(vetor[i]);
				}
			}
			if(codigo == 2) {
				for (int i = (vetor.length - 1); i >= 0; i--) {
					System.out.println(vetor[i]);
				}
			}
		}
		teclado.close();

	}

}
