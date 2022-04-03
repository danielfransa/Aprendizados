package br.com.dominio.s07;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		//variaveis
		int valor, maior = -999, menor = 999, soma = 0;
		float media;
		Scanner teclado = new Scanner(System.in);
		
		//entrada/processamento
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe um Valor: ");
			valor = teclado.nextInt();
			
			if(valor > 0) {
				if(valor > maior) {
					maior = valor;
				}
				if(valor < menor) {
					menor = valor;
				}
				soma = soma + valor;
			}else {
				i --;
			}
		}
		media = soma / 10f; 
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		System.out.println("A média dos número é: " + media);
		teclado.close();
		
		}
}
