#include<stdio.h>

int main(){
	//variaveis
	float vetor[5];
	int codigo;
	//entradas
	printf("Informe o código: ");
	scanf("%d", &codigo);
	if(codigo != 0){
		for(int i = 0; i < 5; i++){
			printf("Informe um número real %d/5: ", (i+1));
			scanf("%f", &vetor[i]);
		}
		if(codigo == 1){
			for(int i = 0; i < 5; i++){
				printf("%.2f\n", vetor[i]);
			}
		}
		if(codigo == 2){
			for(int i = 4; i >= 0; i--){
				printf("%.2f\n", vetor[i]);
			}
		}
	}
}
