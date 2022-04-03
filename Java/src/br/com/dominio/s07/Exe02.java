package br.com.dominio.s07;

public class Exe02 {

	public static void main(String[] args) {
		// processamento
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
			if(i % 10 == 0) {
				System.out.printf("%d é Multiplo de Dez\n", i);
			}
		}	
	}
	

}
