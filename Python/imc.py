#Exercício 02: Tendo como dados de entrada o peso e altura de uma
#pessoa, construa um algoritmo que calcule seu IMC, usando a seguinte
#fórmula: IMC = Peso / (Altura)²

peso = float(input("informe seu peso: "))
altura = float(input("informe sua altura: "))
imc = peso / altura**2
print ("O imc é: ", imc)