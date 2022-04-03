#include <stdio.h>
//std = standard (padrão)
//io = input/output (entrada/saida)

int main(){
	//Declaração de Variáveis
	int num1, num2, soma, multi;

	//Entradas
	printf("Informe o primeiro número: "); //impresso no inicio do programa na tela para o usuario
	scanf("%d", &num1); //receba  entrada via teclado e coloque ela na variavel num1

	printf("Informe o segundo número: ");
	scanf("%d", &num2); //receba  entrada via teclado e coloque ela na variavel num2

	//Processamentos
	soma = num1 + num2;
	multi = soma * num1;

	//Saídas
	printf("O resultado da mutiplicação é %d", multi);

}

	//Não esquecer os ";" verificar todas as linhas com erro um erro na primeira linha pode ser reflexo de um erro em outra linha
