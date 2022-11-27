print("Ingrese el punto x:")
x = float(input())

print("Ingrese el punto y")
y = float(input())

if x > 0 and y > 0:
    plano = "Cuadrante 1"
if x < 0 and y > 0:
    plano = "Cuadrante 2"
if x < 0 and y < 0:
    plano = "Cuadrante 3"
if x > 0 and y < 0:
    plano = "Cuadrante 4"

print(plano)