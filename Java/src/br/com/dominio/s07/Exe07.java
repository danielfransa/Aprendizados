package br.com.dominio.s07;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
	 //variaveis
		int cod, defeito, cont_total = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o Código: ");
		cod = teclado.nextInt();
		
		while(cod != 0) {
			System.out.println("1 - Necessita de esfera.");
			System.out.println("2 - Necessita de limpeza.");
			System.out.println("3 - Necessita de troca de cabo ou conector.");
			System.out.println("4 - Quebrado ou inutilizado.");
			System.out.println("Informe o defeito");
			
			defeito = teclado.nextInt();
			
					if (defeito == 1) {
						cont1 = cont1 + 1;
					}
					if (defeito == 2) {
						cont2 = cont2 + 1;
					}
					if (defeito == 3) {
						cont3 = cont3 + 1;
					}
					if (defeito == 4) {
						cont4 = cont4 + 1;
					}
				cont_total = cont_total + 1;
			System.out.println("Informe o Código: ");
			cod = teclado.nextInt();
		}
		float p1, p2, p3, p4;
		p1 = ((float)cont1 / (float)cont_total) * (float)100.00;
		p2 = ((float)cont2 / (float)cont_total) * (float)100.00;
		p3 = ((float)cont3 / (float)cont_total) * (float)100.00;
		p4 = ((float)cont4 / (float)cont_total) * (float)100.00;
		
		System.out.printf("Quantidade de mouses = %d\n", cont_total);
		System.out.println("Situaçao \t\t\t\t\t   Quantidade \t\tPercentual");
		System.out.printf("1 - Necessita de esfera.\t\t\t\t%d \t\t   %.2f%%\n", cont1, p1);
		System.out.printf("2 - Necessita de limpeza.\t\t\t\t%d \t\t   %.2f%%\n", cont2, p2);
		System.out.printf("3 - Necessita de troca de cabo ou conector.\t\t%d \t\t   %.2f%%\n", cont3, p3);
		System.out.printf("4 - Quebrado ou inutilizado.\t\t\t\t%d \t\t   %.2f%%\n", cont4, p4);
		
		teclado.close();
	}

}
