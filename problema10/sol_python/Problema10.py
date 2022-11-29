suma = 0
contador = 0
bandera = True

while bandera:
    print("Ingrese un numero:")
    numero = float(input())
    suma = suma + numero
    contador = contador + 1

    print("Si desea no ingresar mas numeros, ingrese 'S':")
    salida = input()
    if salida == "S":
        bandera = False

media = suma / contador
print("La media es: ", media)