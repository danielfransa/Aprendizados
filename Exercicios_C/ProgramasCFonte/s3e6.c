#include<stdio.h>
int main(){
	//variveis
	int horas;
	float sph, salario; //sph = salario por hora

	//entradas
	printf("Informe a quantidade de horas trabalhadas: ");
	scanf("%d", &horas);

	printf("Informe seu salário por hora: ");
	scanf("%f", &sph);

	//processamento
	salario = sph * horas;

	//saída
	printf("Seu salario será de: %.2f reais", salario);

}
