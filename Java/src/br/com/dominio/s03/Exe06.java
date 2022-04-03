package br.com.dominio.s03;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		// Variveis
		int horas;
		float sal_hora, salario_final;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Qual seu salário por hora?");
		sal_hora = teclado.nextFloat();
		System.out.println("Quantas horas foram trabalhadas?");
		horas = teclado.nextInt();
		
		//processamento
		salario_final = (sal_hora * horas);
		
		//saída
		System.out.println("Seu salário será de R$ " +salario_final );
		
		teclado.close();
		
	}

}
