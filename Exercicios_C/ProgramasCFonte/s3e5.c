#include<stdio.h>
int main(){
	//variaveis
	int metros, centimetros;

	//entradas
	printf("Insira o valor em Metros: ");
	scanf("%d", &metros);

	//processamento
	centimetros = metros * 100;

	//saída
	printf("O valor em Centímetros é: %d \n", centimetros);

	printf("%d metros em centímetros é %d", metros, centimetros);


}
// utiliza-se o "\n" para quebrar linha porem ele fica dentro do escrito no printf conforme esse programa
