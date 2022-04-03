#Entradas
quant_min = int(input("Informe a quantidade mínima para o estoque: "))
quant_max = int(input("Informe a quantidade máxima para o estoque: "))

#Processamento
estoque_medio = (quant_min + quant_max) / 2

#saída
print("O estoque médio é de {0}".format(estoque_medio))
