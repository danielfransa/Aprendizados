#include<stdio.h>

int main(){

	//Variaveis
	int n1, n2, n3, n4, q1, q2, q3, q4;

	printf("Digite o 1º número: ");
	scanf("%d", &n1);
	printf("Digite o 2º número: ");
	scanf("%d", &n2);
	printf("Digite o 3º número: ");
	scanf("%d", &n3);
	printf("Digite o 4º número: ");
	scanf("%d", &n4);

	//processamento
	q1 = n1 * n1;
	q2 = n2 * n2;
	q3 = n3 * n3;
	q4 = n4 * n4;

	if(q3 >= 1000){
		printf("3º Número é: %d, Valor do seu Quadrado é: %d ", n3, q3);
	}else{
		printf("1º número é: %d, Valor do seu Quadrado é: %d\n ", n1, q1);
		printf("2º número é: %d, Valor do seu Quadrado é: %d\n ", n2, q2);
		printf("3º número é: %d, Valor do seu Quadrado é: %d\n ", n3, q3);
		printf("4º número é: %d, Valor do seu Quadrado é: %d\n ", n4, q4);
	}


}
