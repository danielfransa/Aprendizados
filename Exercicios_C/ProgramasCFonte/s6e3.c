#include<stdio.h>

int main(){

	//variaveis
	int numero, p = 0, i = 0;

	//entrada
	printf("Insira um número:" );
	scanf("%d", &numero);

	//Processamento
	if (numero % 2 == 0 ){
		p = numero;
		printf("O número %d é par.", p);
	}else{
		i = numero;
		printf("O número %d é impar.", i);
	}

}
