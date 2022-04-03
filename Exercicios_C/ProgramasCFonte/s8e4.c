#include<stdio.h>

int main(){
	//variaveis
	int vetor[20], soma = 0;
	//entrada
	for(int i = 0; i < 20; i++){
		printf("Informe o valor para o vetor %d/20: ", (i+1));
		scanf("%d", &vetor[i]);
		//procesamento
		soma = soma + vetor[i];
	}
	//saida
	printf("A soma do vetor é: %d", soma);
}
