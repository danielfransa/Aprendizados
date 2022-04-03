package br.com.dominio.s08;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
	//variaveis
		int[] vetor1 = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		// entradas
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o valor para o vetor: ");
			vetor1[i] = teclado.nextInt();
		}
		for (int i = 9; i >= 0; i--) {  //for (int i = (vetor.length - 1); i >= 0; i--) 
			System.out.println(vetor1[i]);
		}
		teclado.close();
	}

}
