import random # módulo random
certo = random.randrange(1,101)
tentativas = 1
palpite = 0
while palpite != certo:
    
    palpite = int(input("Adivinhe meu número entre 1 e 101:"))
    tentativas += 1
    if palpite == -1: 
        print("correu")
        print("O número correto é: ", certo)
        print("A quantidade de tentativas é:  ", tentativas)
        break
else:
    print("Número correto!")
    print("A quantidade de tentativas é:  ", tentativas)
    print("O número correto é: ", certo)

