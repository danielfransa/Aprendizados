#include<stdio.h>

int main(){
	//variaveis
	int vetor1[10];
	//entrada
	for(int i = 0; i < 10; i++){
		printf("Informe um valor para o vetor: ");
		scanf("%d", &vetor1[i]);
	}
	for (int i = 9; i >= 0; i--){
		printf("%d\n", vetor1[i]);
	}
}
