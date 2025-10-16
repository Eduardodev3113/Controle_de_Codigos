"""Escreva um programa que leia 10 palavras usando um laço FOR, armazenando-as em uma
lista. Em seguida, crie um segundo laço de repetição para percorrer a lista e verificar qual é a
palavra que possui o maior número de caracteres. Por fim, imprima apenas a palavra com o
maior número de caracteres. Observe o exemplo abaixo."""
frutas = []
for i in range(0,10):
    f = input("Digite uma Palavra: ")
    frutas.append(f)
maior = ""
m_palavra = 0
for i in range(0, len(frutas)):
    if len(frutas[i]) > m_palavra:
        maior = frutas[i]
        m_palavra = len(frutas[i])
print("A palavra com o maior número de letras é: ", maior)

    

