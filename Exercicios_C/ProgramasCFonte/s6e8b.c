#include<stdio.h>

int main(){
	//variaveis
	int numero;

	//entradas
	printf("Informe um número: ");
	scanf("%d", &numero);

	//processamento
	if(numero % 2 == 0){
		if(numero > 0){
			printf("O número %d é par e positivo.", numero);
		}else{
			printf("O número %d é par e negativo.", numero);
		}
	}else{
		if(numero > 0){
			printf("O número %d é impar e positivo.", numero);
		}else{
			printf("O número %d é impar e negativo.", numero);
		}
	}
}
