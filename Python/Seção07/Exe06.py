#entrada
n = int(input("Informe um número: "))
#porcessamento
for i in range(1, 11):
    m = i * n 
    print("{0} X {1} = {2}".format(i, n, m))
    