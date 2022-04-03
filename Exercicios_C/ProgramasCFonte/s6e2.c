#include<stdio.h>
int main(){
	//variaveis
	int num, a, b;

	//entradas
	printf("Digite um número! ");
	scanf("%d", &num);

	//processamento
	if(num > 0){
		a = num;
		printf("Valor %d é Positivo!", a );
	}else{
		b = num;
		printf("Valor %d é Negativo!", b );
	}
}
