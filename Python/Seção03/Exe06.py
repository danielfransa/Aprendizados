#entradas
horas = int(input("Informe a quantidade de horas trabalhadas: "))
valor_horas = float(input("Informe o valor do sálario por hora: "))
#processamento
salario = (horas * valor_horas)
#saídas
print("O seu sálario será de R$ {0:.2f}".format(salario))