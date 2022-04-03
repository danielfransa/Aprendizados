package br.com.dominio.s06;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		// Variaveis
		float altura, peso_ideal;
		char sexo;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe sua altura: ");
		altura = teclado.nextFloat();
		
		System.out.println("Informe o sexo m/f: ");
		sexo = teclado.next().charAt(0);
		
		// processamento
		if(sexo == 'm' || sexo == 'M') {
			peso_ideal = (float)(72.7 * altura) - 58; //cast
			System.out.printf("Seu peso ideal é %.2f ", peso_ideal);
		}
		if(sexo == 'f' || sexo == 'F') {
			peso_ideal = (float)(62.1 * altura) - 44.7f; //cast
			System.out.println("Seu peso ideal é " + peso_ideal);
		}
		if(sexo != 'm' && sexo != 'M' && sexo != 'f' && sexo != 'F') {
			System.out.println("Sexo não reconhecido! ");
			peso_ideal = 0;
		}
		teclado.close();
	}

}
