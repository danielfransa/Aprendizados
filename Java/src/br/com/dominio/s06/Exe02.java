package br.com.dominio.s06;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		// variaveis
				int num1, a, b;
				Scanner teclado = new Scanner(System.in);
				//entradas
				System.out.println("Insira um número: ");
				num1 = teclado.nextInt();
				//processamento
				if (num1 > 0) {
					a = num1;
					System.out.println("O Valor Positivo: " + a);
				}else {
					b = num1;
					System.out.println("O Valor Negativo: " + b);
				}
				teclado.close();
		
	}

}
