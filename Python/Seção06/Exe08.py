#entradas
num = int(input("Insira um número: "))
#processamento
if num > 0:
    if num % 2 == 0:
        print("{0} é Positivo e Par".format(num))
    else:
        print("{0} é Positivo e Impar".format(num))
else:
    if num % 2 == 0:
        print("{0} é Negativo e Par".format(num))
    else:
        print("{0} é Negativo e Impar".format(num))