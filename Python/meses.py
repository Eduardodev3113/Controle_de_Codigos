"""1. Escreva um programa em que o usuário possa digitar diversos números (de 1 a 12) e
armazene esses números em uma lista. Após a lista de números inteiros estar completamente
preenchida, percorra com um segundo laço de repetição cada valor, e imprima o nome do mês
correspondente a cada número contido na lista."""
numeros = []
n = 1
meses = ["antiaparecimento", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"]
while n >=1 and n <= 12:
    n = int(input("Digite um número entre 1 e 12 (ou fora do intervalo para sair): "))
    numeros.append(n)
    if n == 0:
        print("Numero inválido")
numeros.pop()
for i in range(0,len(numeros)):
    print(meses[numeros[i]])
