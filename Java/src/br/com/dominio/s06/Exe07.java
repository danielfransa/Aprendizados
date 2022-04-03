package br.com.dominio.s06;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
	 //variaveis
		int n1, n2, n3, n4, q1, q2, q3, q4;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Insira o 1º número: ");
		n1 = teclado.nextInt();
		System.out.println("Insira o 2º número: ");
		n2 = teclado.nextInt();
		System.out.println("Insira o 3º número: ");
		n3 = teclado.nextInt();
		System.out.println("Insira o 4º número: ");
		n4 = teclado.nextInt();
		
		//processamento
		q1 = (n1 * n1);
		q2 = (n2 * n2);
		q3 = (n3 * n3);
		q4 = (n4 * n4);
		
		if(q3 > 1000) {
			System.out.printf("3º Número: %d Quadrado: %d\n", n3, q3);;
		}else {
			System.out.printf("1º Número: %d Quadrado: %d\n", n1, q1);
			System.out.printf("2º Número: %d Quadrado: %d\n", n2, q2);
			System.out.printf("3º Número: %d Quadrado: %d\n", n3, q3);
			System.out.printf("4º Número: %d Quadrado: %d\n", n4, q4);
			
		}
		teclado.close();

	}

}
