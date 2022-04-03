package br.com.dominio.s06;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {
		//variaveis
		int n;
		Scanner teclado = new Scanner(System.in);

		//entradas
		System.out.println("Insira um número: ");
		n = teclado.nextInt();
		
		//processamento
		if(n % 2 == 0) {
			if (n > 0) {
				System.out.printf("O Número %d é Positivo e Par\n", n );
			}else {
				System.out.printf("O Número %d é Negativo e Par\n", n );
				
			}
			
		}
		if(n % 2 != 0) {
			if (n > 0) {
				System.out.printf("O Número %d é Positivo e Impar\n", n );
			}else {
				System.out.printf("O Número %d é Negativo e Impar\n", n );
			}
				
		}
		teclado.close();
	}

}
