'''2) Faça um programa que leia nomes digitados pelo usuário ou “-1” para
parar a leitura de nomes. No final o programa deve imprimir esses
nomes.'''
nomes = []
b = 0
while 1 > 0:
    b = (input('Digite um nome: '))
    nomes.append(b)
    if(b == "-1"):
        nomes.remove(b)
        break
    
print(nomes)

'''
Forma alternativa

nomes = []
a = 0
while 1 > 0:
    a = (input('Digite um nome: '))
    if(a != "-1"):
        nomes.append(a)
    else:
        break
    
print(nomes'''