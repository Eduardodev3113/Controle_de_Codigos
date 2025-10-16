'''4. Faça um programa que leia 10 idades e armazene em uma lista. Em um segundo laço,
percorra a lista e descubra a maior e a menor idade. Ao final, deve ser impresso todas as
idades, além da maior e menor idade. Veja o exemplo abaixo.'''
idades = []
maior = 0 
menor = 9999
for i in range(0,10):
    d = int(input("Digite uma idade: "))
    idades.append(d)
for i in range(0, len(idades)):
    if idades[i] > maior:
        maior = idades[i]
    if idades[i] < menor:
        menor = idades[i]
print("a maior idade digitada é: ", maior)
print("Todas as idades digitadas são: ", idades)
print("a menor idade digitada é: ", menor)


    