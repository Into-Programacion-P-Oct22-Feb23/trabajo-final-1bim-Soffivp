print("Ingrese el nombre del empleado:")
nombre = input()

print("Ingrese el tipo de empleado")
tipo = int(input())

print("Ingrese el numero de horas trabajadas")
horas = int(input())

print("Ingrese la cuota de paga por hora")
cuota = float(input())

if horas > 40 and tipo <= 4 :
    if tipo == 1 :
        sueldo = horas * (cuota * 1.5)
    if tipo  == 2 :
        sueldo = horas * (cuota * 2 )
    if tipo  == 3 :
        sueldo = horas * (cuota * 2.5 )
    if tipo  == 4 :
        sueldo = horas * (cuota * 3 )

else:
    sueldo = horas * cuota

print("El sueldo a pagar es :", sueldo)