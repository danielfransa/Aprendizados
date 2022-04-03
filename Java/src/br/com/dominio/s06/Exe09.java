package br.com.dominio.s06;

import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		// variaveis
		float indice;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o indice de poluição: ");
		indice = teclado.nextFloat();
		
		//processamento
		if (indice < 0.3){
			System.out.println("Indice de puluição aceitavél. ");
		}else if(indice >= 0.3 && indice < 0.4) {
			System.out.println("ATENÇÃO! Indústrias do 1º grupo devem suspender as atividades. ");
		}else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("ATENÇÃO! Indústrias do 1º e 2º grupo devem suspender as atividades. ");
		}else if(indice >= 0.5) {
			System.out.println("ATENÇÃO! Todos os Grupos devem suspender as atividades. ");
		}
		teclado.close();
	}

}
