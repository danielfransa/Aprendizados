#Entradas
indice = float(input("Insira o índice de poluição: "))
#processamento/saida
if indice >= 0.3 and indice < 0.4:
    print("Grupo 1 suspender as atividades")
if indice >= 0.4 and indice < 0.5: #pode se utilizar elif
    print("Grupo 1 e grupo 2 suspender as atividades")
if indice >= 0.5:
    print("Todos os grupos suspender as atividades")
if indice < 0.3:
    print("Niveís aceitáveis")