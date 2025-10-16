'''5. Faça um Programa que leia 10 letras (minúsculas) e armazene em uma lista. Crie um segundo
laço de repetição para percorrer cada letra salva na lista, depois, imprima quantas consoantes
foram lidas (mesmo aquelas que sejam repetidas na lista).'''
consoantes = []
cont = 0
vogais = ["a", "e", "i", "o", "u"]
for i in range(0, 10):
    c = input("Informe uma letra: ").lower()
    consoantes.append(c)
print("Foram digitados as seguintes consoantes: ")
for i in range (0, len(consoantes)):
    if consoantes[i] not in vogais:
        cont += 1
        print(consoantes[i])
print("O total de consoantes digitadas são: ", cont)

    
    
