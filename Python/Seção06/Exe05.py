#variaveis
excesso = 0
multa = 0
#entradas
peso = float(input("Informe a quantidade em kg de peixes: "))
#processamento
if peso > 50:
    excesso = peso - 50
    multa = excesso * 4.00
#saidas
    print("Seu excesso é de {0:.2f} Kg".format(excesso))
    print("Deverá pagar R$ {0:.2f} ".format(multa))
else:
    print("{0:.2f} Kg esta dentro do peso regulamentado".format(peso))
    print("Seu excesso é de {0:.2f} Kg".format(excesso))
    print("Deverá pagar R$ {0:.2f} ".format(multa))