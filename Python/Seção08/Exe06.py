#variaveis
vetor = []
#entradas
cod = int(input("Informe o código: "))
#processamento
if cod != 0 and cod <=2:
    for n in range (0, 5):
        num = float(input("Informe um valor real: "))
        vetor.append(num)
    if cod == 1:
        print(vetor)
    if cod == 2:
        vetor.reverse()
        print(vetor)