#include<stdio.h>
int main(){
	//Variaveis
	int num1, num2, soma;

	//entradas
	printf("Insira o primeiro número: ");
	scanf("%d", &num1);

	printf("Insira o segundo número: ");
	scanf("%d", &num2);

	//processamento
	soma = num1 + num2;

	//saida
	printf("O resultado da soma é: %d", soma);
}
