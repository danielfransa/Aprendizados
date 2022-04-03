package br.com.dominio.s06;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		//variaveis
		int c;
		float n, e = 0, salario, valor_hora = (float) 10.00;
		Scanner teclado = new Scanner(System.in);
		
		// entradas
		System.out.println("Informe o código: ");
		c = teclado.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		n = teclado.nextFloat();
		
		// processamento
		if(n > 50) {
			e = (n - 50) * 20.00f;
			salario = (50 * valor_hora) + e;
			System.out.printf("Sálario total R$ %.2f\n", salario);
			System.out.printf("Sálario excedente R$ %.2f\n", e);
		}else {
			salario = n * valor_hora;
			System.out.printf("Sálario total R$ %.2f\n", salario);
			System.out.printf("Sálario excedente R$ %.2f\n", e);
		}
		teclado.close();

	}

}
