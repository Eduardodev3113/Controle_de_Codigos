''' 3) Faça um programa que armazene números inteiros positivos (“-1” para
finalizar o programa). Salve os números em uma lista. Imprima essa lista
com todos os elementos (mostre a lista completa). Em seguida, o
programa deve remover números menores que 30. Ao final, o programa
deve imprimir os valores restantes.
• Não pode usar funções de ordenação (sort e reverse'''

numeros = []
n = 0
while n != -1:
    n = int(input("Digite um número inteiro, ou digite -1 para sair: "))
    numeros.append(n)
numeros.pop()
print(numeros)
numeros = [num for num in numeros if num >= 30]
print(numeros)



    

