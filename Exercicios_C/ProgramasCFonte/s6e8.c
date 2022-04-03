#include<stdio.h>

int main(){

	//variaveis

	int n1;

	//entradas
	printf("Insira um número: ");
	scanf("%d", &n1);

	//processamento

	if (n1 % 2 == 0){
		printf("Número par!\n");
	}else{
		printf("Número impar!\n");
	}
	if (n1 > 0){
		printf("Número Positivo");
	}else{
		printf("Número Negativo");
	}
}
