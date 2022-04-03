#include<stdio.h>

int main(){
	//variaveis
	float p, m;
	char e[8] = "excesso";  // 8 caracteres pq em c sempre a palavra termina com '\0' isso é inserido pelo sistema

	//entrada
	printf("Informe o peso dos peixes: ");
	scanf("%f", &p);

	//processamento
	if(p > 50){
		m = (p - 50) * 4.00;
		// saida com multa
		printf("Você deverá pagar R$ %.2f em multas.", m);
	}else{
		m = 0;
		e[0] = 0;
		//saida sem multa
		printf("Multas: %.2f\n", m);
		printf("Excesso: %d", e[0]);
	}


}
