print("Ingrese la cantidad de trajes comprados: ")
cantidad =  int(input())

print("Ingrese la el precio del traje comprado: ")
precio =  int(input())

subtotal = precio * cantidad

if cantidad == 1 :
    descuento = subtotal * 0.2
    total = subtotal - descuento
if cantidad == 2 :
    descuento = subtotal * 0.25
    total = subtotal - descuento
if cantidad == 3 :
    descuento = subtotal * 0.4
    total = subtotal - descuento
if cantidad > 3:
    descuento = subtotal * 0.5
    total = subtotal - descuento

print("El subtotal de la venta es :", subtotal)
print("El descuento es: ", descuento)
print("El precio total es: ", total)