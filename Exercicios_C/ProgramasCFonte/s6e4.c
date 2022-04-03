#include<stdio.h>
#include<ctype.h> //biblioteca de caracteres

int main(){
	//variaveis
	float altura, peso_ideal;
	char sexo;

	//entrada
	printf("Informe seu sexo com M para masculino e F para feminino: ");
	scanf("%c", &sexo);

	printf("Informe sua altura: ");
	scanf("%f", &altura);

	//processamento
	if (tolower(sexo) == 'm'){
		peso_ideal = (72.7 * altura) -58;
		printf("Seu peso ideal é: %.2f", peso_ideal);
	}if (tolower(sexo) == 'f'){
		peso_ideal = (62.1 * altura) -44.7;
		printf("Seu peso ideal é: %.2f", peso_ideal);
	}if (tolower(sexo) != 'm' && tolower(sexo) != 'f'){
		printf("Sexo não reconhecido");
	}
}
//tolower transforma qualquer caracter digitado em minusculo
/* caso colocasse primeiro para informar a altura daria um erro onde ele tentaria calcular direto sem pedir
o sexo para isso podemos utilizar entre uma entrada e outra o código 'gets(stdin);' ele vai corrigir essa
falha */
