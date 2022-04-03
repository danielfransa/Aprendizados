package br.com.dominio.s06;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		// Variaveis
		float p, m, exe;
		String e = "Excesso";
		Scanner teclado = new Scanner(System.in);
		
		// Entrada
		System.out.println("Insira o peso dos peixes: ");
		p = teclado.nextFloat();
		
		//processamento
		if(p > 50) {
			exe = (p - 50);
			m = (exe * 4.00f);
			System.out.printf(e + " de %.2f Kg e sua multa será de R$ %.2f ", exe, m);
		}else {
			exe= 0;
			m = 0;
			System.out.println("Quantidade dentro do limite");
			System.out.println(e + ": " + exe );
			System.out.println("Multa: " + m);
		}
		teclado.close();

	}

}
