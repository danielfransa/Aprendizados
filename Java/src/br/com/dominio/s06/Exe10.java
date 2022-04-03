package br.com.dominio.s06;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		// variaveis
		int idade;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe a idade do nadador: ");
		idade = teclado.nextInt();
		
		//processamento
		if (idade >= 5 && idade <= 7){
			System.out.println("Infantil A");
		}else if(idade >= 8 && idade <= 11) {
			System.out.println("Infantil B");
		}else if(idade >= 12 && idade <= 13) {
			System.out.println("Juvenil A");
		}else if(idade >= 14 && idade <= 17) {
			System.out.println("Juvenil B");
		}else if(idade >=18) {
			System.out.println("Adulto");
		}
		teclado.close();
	}

}
