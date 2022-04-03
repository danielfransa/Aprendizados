#include<stdio.h>
int main(){
	//variaveis
	float altura, peso_ideal;

	//entradas
	printf("Qual a sua Altura? ");
	scanf("%f", &altura);

	//processamento
	peso_ideal = (72.7 * altura) - 58;

	//saída
	printf("Seu Peso Ideal é: %.2f", peso_ideal);


}
