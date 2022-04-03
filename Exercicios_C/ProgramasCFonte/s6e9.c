#include<stdio.h>

int main(){
	//variaveis
	float indice;

	//entradas
	printf("Informe o índice de poluição: ");
	scanf("%f", &indice);

	//processamento
	if(indice >= 0.3 && indice < 0.4){
		printf("Atenção: Indústrias do 1º grupo devem suspender as atividades.");
	}else if(indice >= 0.4 && indice < 0.5){
		printf("Atenção: Indústrias do 1º e 2º grupo devem suspender as atividades.");
	}else if(indice >= 0.5){
		printf("Atenção: Todos os grupo devem suspender as atividades.");
	}else if(indice < 0.3){
		printf("Níveis Aceitaveis.");
	}

}
