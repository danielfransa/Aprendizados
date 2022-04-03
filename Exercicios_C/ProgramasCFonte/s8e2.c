#include<stdio.h>

int main(){
	//variaveis
	int vetor1[10], vetor2[10], soma[10];

	//entradas
	for(int i = 0; i < 10; i++){
		printf("Informe um valor para o 1º vetor: ");
		scanf("%d", &vetor1[i]);
		printf("Informe um valor para o 2º vetor: ");
		scanf("%d", &vetor2[i]);
		//processamento
		soma[i] = vetor1[i] + vetor2[i];
	}
	//saida
	for(int i = 0; i < 10; i++){
		printf("%d\n", soma[i]);
	}
}
