package br.com.dominio.s03;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		// variaveis
		int metro, centimetro;
		Scanner teclado = new Scanner(System.in);
		//entradas
		System.out.println("Insira o tamanho em Metros.");
		metro = teclado.nextInt();
		//processamento
		centimetro = metro * 100;
		//saida
		System.out.println(metro + " metros em centímetros é " + centimetro);
		teclado.close();	
	}

}
