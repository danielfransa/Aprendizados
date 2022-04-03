#include<stdio.h>

int main(){
	//variaveis
	int cont_total = 0,
			cont_def1 = 0,
			cont_def2 = 0,
			cont_def3 = 0,
			cont_def4 = 0,
			id,
			def;

	//entradas
	printf("Informe a Identificação: ");
	scanf("%d", &id);

		while(id != 0){
			printf("1 - Necessita de esfera\n");
			printf("2 - Necessita de limpeza\n");
			printf("3 - Necessita de troca de cabo ou conector\n");
			printf("4 - Quebrado ou inutilizado\n");
			printf("Informe o tipo de defeito\n");
			scanf("%d", &def);
			//processamento
			if(def == 1 ){
				cont_def1 = cont_def1 + 1;
			}
			if(def == 2 ){
				cont_def2 = cont_def2 + 1;
			}
			if(def == 3 ){
				cont_def3 = cont_def3 + 1;
			}
			if(def == 4 ){
				cont_def4 = cont_def4 + 1;
			}
			cont_total = cont_total + 1;
			//entradas
				printf("Informe a Identificação: ");
				scanf("%d", &id);

		}
	float p1, p2, p3, p4; //(float) cast
	p1 = ((float)cont_def1 / (float)cont_total * 100.0);
	p2 = ((float)cont_def2 / (float)cont_total * 100.0);
	p3 = ((float)cont_def3 / (float)cont_total * 100.0);
	p4 = ((float)cont_def4 / (float)cont_total * 100.0);

	printf("Quantidade de Mause %d\n\n", cont_total);
	printf("Situção \t\t\t\tQuantidade \tPercental\n");
	printf("1-Necessita de esfera \t\t\t\t%d \t%.2f%%\n", cont_def1, p1);
	printf("2-Necessita de limpeza \t\t\t\t%d \t%.2f%%\n", cont_def2, p2);
	printf("3-Necessita de troca de cabo ou conector \t%d \t%.2f%%\n", cont_def3, p3);
	printf("4-Quebrado ou inutilizado \t\t\t%d \t%.2f%%\n", cont_def4, p4);

}
