#include<stdio.h>

int main(){
	//variaveis
	int vetor[5], pares[5], cont_p = 0;
	//entradas
	for(int i = 0; i < 5; i++){
		printf("Informe um valor para o vetor: ");
		scanf("%d", &vetor[i]);
		// processamento
		if(vetor[i] % 2 == 0){
			if(vetor[i] > 0){
				pares[cont_p] = vetor [i];
				cont_p = cont_p + 1;
			}
		}
	}
	//saida
	for(int i = 0; i < cont_p; i++){
		printf("%d\n", pares[i]);
	}
}

