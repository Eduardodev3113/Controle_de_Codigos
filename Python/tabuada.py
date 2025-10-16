numero1 = int(input("Digite um número de 1 a 10 para exibir a tabuda: "))
while numero1<0 or numero1>10:
    
    numero1 = int(input("Numero invalido, tente novamente: "))

for numero in range(0,10):
    numero = numero+1
    resultado=numero*numero1
    print("Tabuada de", numero, "x", numero1, "=", resultado)