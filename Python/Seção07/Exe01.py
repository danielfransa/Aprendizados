#variaveis
maior = 0
#entradas
n = int(input("Informe um número: "))
#processamento
while n != 0:
    if n > maior:
        maior = n
    n = int(input("Informe um número: "))
#Saída
print("O maior número é {0}".format(maior))
