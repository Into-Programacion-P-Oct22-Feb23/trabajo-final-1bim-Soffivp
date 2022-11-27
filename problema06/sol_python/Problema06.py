contador = 1
numero = 1
cadena = ""

while numero <= 100 :
    cadena = cadena + str(contador) + "+" + str(numero) + "/"
    numero = numero  + contador

print(cadena)