#include<stdio.h>
int main(){
	//variaveis
	int num;

	//entradas
	printf("Digite um Número! ");
	scanf("%d", &num);

	//processamento
	if (num > 100){
		printf("%d", num);
	}else{
		printf("%d", 0); //pode tbm colocar para a variavel num receber 0, e então no printf ao invez de 0 coloca a variavel num.
	}
}
