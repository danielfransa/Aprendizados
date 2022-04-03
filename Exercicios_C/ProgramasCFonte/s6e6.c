#include<stdio.h>

int main(){
	//variaveis
	int c;
	float n, e = 0, salario, valor_hora = 10.00;

	//entradas
	printf("Informe o código: ");
	scanf("%d", &c);
	printf("Informe a quantidade de horas trabalhadas: ");
	scanf("%f", &n);

	//processamento
	if(n > 50){
		e = (n - 50) * 20.00;
		salario = (50 * valor_hora) + e;
		//saida se tiver horas excedentes
		printf("Salário Total R$ %.2f\n", salario);
		printf("Salário excedente R$ %.2f", e);
	}else{
		salario = n * valor_hora;
		//saida se não tiver horas excedentes
		printf("Salário Total R$ %.2f\n", salario);
		printf("Salário excedente R$ %.2f", e);
	}
}
