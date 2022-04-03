#entradas
c = int(input("Informe o código: "))
h = int(input("Informe as horas trabalhadas: "))
#processamento
if h > 50:
    e = (h - 50) * 20
    s = (50 * 10) + e 
    print("Seu sálario será de R$ {0:.2f}".format(s))
    print("Seu sálario excedente foi de R$ {0:.2f}".format(e))
else:
    s = h * 10
    e = 0
    print("Seu sálario será de R$ {0:.2f}".format(s))
    print("Seu sálario excedente foi de R$ {0:.2f}".format(e))