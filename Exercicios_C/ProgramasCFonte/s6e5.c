#include<stdio.h>

int main(){
	//Variaveis

	int peso, e, m;

	//entradas
	printf("Informe a quantidade de peixe em Kg: ");
	scanf("%d", &peso);

	//processamento
	if(peso > 50){
		e = peso - 50;
	}else{
		e = 0;
	}

	m = e * 4;

	printf("Peso total = %d\n", peso);
	printf("Excesso de peso = %d\n", e);
	printf("Multa a ser paga = R$%d", m);

}
