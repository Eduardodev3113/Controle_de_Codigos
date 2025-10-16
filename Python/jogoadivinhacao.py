import random

def jogar_adivinhacao():
    numero_secreto = random.randint(1, 5000)
    tentativas = 0
    palpite = 0

    print("Bem-vindo ao jogo de adivinhação!")
    print("Estou pensando em um número entre 1 e 5000.")

    while palpite != numero_secreto:
        try:
            palpite = int(input("Faça seu palpite: "))
            tentativas += 1

            if palpite < numero_secreto:
                print("Mais alto...")
            elif palpite > numero_secreto:
                print("Mais baixo...")
            else:
                print(f"Parabéns! Você acertou o número com {tentativas} tentativas.")
        except ValueError:
            print("Por favor, insira um número válido.")

jogar_adivinhacao()
