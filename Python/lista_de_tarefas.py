tarefas = []

def adicionar_tarefa():
    nova_tarefa = input("Digite a nova tarefa: ")
    tarefas.append({"tarefa": nova_tarefa, "concluida": False})
    print("Tarefa adicionada com sucesso!")

def exibir_tarefas():
    if not tarefas:
        print("Lista de tarefas vazia.")
    else:
        print("Lista de Tarefas:")
        for i, tarefa in enumerate(tarefas, start=1):
            status = "Concluída" if tarefa["concluida"] else "Pendente"
            print(f"{i}. {tarefa['tarefa']} - {status}")

def marcar_concluida():
    exibir_tarefas()
    numero_tarefa = int(input("Digite o número da tarefa concluída: "))
    if 1 <= numero_tarefa <= len(tarefas):
        tarefas[numero_tarefa - 1]["concluida"] = True
        print("Tarefa marcada como concluída!")
    else:
        print("Número de tarefa inválido.")

while True:
    print("\nSimulador de Lista de Tarefas")
    print("1. Adicionar Tarefa")
    print("2. Exibir Tarefas")
    print("3. Marcar Tarefa como Concluída")
    print("0. Sair")

    opcao = input("Escolha uma opção: ")

    if opcao == "1":
        adicionar_tarefa()
    elif opcao == "2":
        exibir_tarefas()
    elif opcao == "3":
        marcar_concluida()
    elif opcao == "0":
        print("Saindo do programa. Até logo!")
        break
    else:
        print("Opção inválida. Tente novamente.")

