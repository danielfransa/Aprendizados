package br.com.dominio.s03;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
		// Variaveis
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Insira sua altura: ");
		altura = teclado.nextFloat();
		 
		//processamento
		peso_ideal = (float)(72.7 * altura) - 58; //cast
		
		//saída
		System.out.println("Seu peso ideal é: " + peso_ideal + "Kg");
		
		teclado.close();
	}

}
