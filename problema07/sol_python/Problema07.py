numero = int(input())
contador = 2
suma = 0
if numero > 2 and numero % 2 == 0:
    while contador <= numero:
        suma = suma + contador
        contador = contador + 2
    print(suma)
else:
    print("Error")