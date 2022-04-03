#include<stdio.h>

int main(){
	//declaração das variaveis
	int quantidade_minima, quantidade_maxima;
	float estoque_medio;

	//entradas
	printf("Informe a quantidade mínima: ");
	scanf("%d", &quantidade_minima);

	printf("Informe a quantidade máxima: ");
	scanf("%d", &quantidade_maxima);

	//Processamento
	estoque_medio = (quantidade_minima + quantidade_maxima) / 2;

	//Saída
	printf("Estoque médio é %.2f ", estoque_medio);

}
//pra float utilizar %f e %.2f limita a 2 casas decimais
