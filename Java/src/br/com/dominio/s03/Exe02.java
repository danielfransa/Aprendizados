package br.com.dominio.s03;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		//variaveis
		int quantidade_minima, quantidade_maxima, soma;
		float media;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe a quantidade mímina do estoque: ");
		quantidade_minima = teclado.nextInt();
		System.out.println("Informe a quantidade máxima do estoque: ");
		quantidade_maxima = teclado.nextInt();
		
		//processamento
		soma = quantidade_minima + quantidade_maxima;
		media = soma / 2f; // uma das variaveis aqui tem que estar com ponto flutuante "f" se não não sai o resultado correto
		
		//saida
		System.out.println("O estoque médio é: " +media);
		
		teclado.close();
	}

}
