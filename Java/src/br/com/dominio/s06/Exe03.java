package br.com.dominio.s06;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		// variaveis
		int valor, p = 0, i = 0;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Insira um número: ");
		valor = teclado.nextInt();
		
		//processamento
		if(valor % 2 == 0) {
			p = valor;
			System.out.println("p");
		}else {
			i = valor;
			System.out.println("i");
		}
		System.out.println(p);
		System.out.println(i); // é necessário colocar um valor inicial para p e para i.
				teclado.close();
	}

}
