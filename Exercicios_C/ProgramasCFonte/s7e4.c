#include<stdio.h>

int main(){
	//variaveis
	int valor, maior = -999, menor = 999, soma = 0;
	float media;

	//entradas
	for (int i = 0; i < 10; i++){
		printf("Informe um número: ");
		scanf("%d", &valor);
		//processamento
		if(valor > 0){
			if(valor > maior){
				maior = valor;
			}
			if(valor < menor){
				menor = valor;
			}
			soma = soma + valor;
		}else{
			i--;
			printf("Esse valor não é valido\n"); //melhoria
		}
	}
	media = soma / 10;
	printf("O maior número é %d\n", maior);
	printf("O menor número é %d\n", menor);
	printf("A média dos número é %2.f", media);
}
