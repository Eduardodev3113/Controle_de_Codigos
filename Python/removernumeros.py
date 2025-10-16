'''Faça um programa que leia 8 números inteiros e armazene uma lista. Em um segundo laço
de repetição, verifique cada valor e remova aqueles números que não são pares. Por fim,
imprima a lista com as modificações realizadas.'''
numeros = []
for i in range(0,8):
    n = int(input("Digite um numero: "))
    numeros.append(n)
i_atual = 0
while i_atual < len(numeros):
    if numeros[i_atual] % 2 == 1:
        numeros.pop(i_atual)
    else:
        i_atual = i_atual + 1
print(" os valores pares são: ", numeros)
