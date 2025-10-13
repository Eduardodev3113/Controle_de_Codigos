import java.util.Scanner;

public class Conta_main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Instância de agência
        Agencia agencia = new Agencia("Av. Paulista, 1000", "(11) 9999-8888", "Carlos Silva");
        
        // Instância de conta
        Conta conta = new Conta(agencia.getNumag(), 1500.0, "123.456.789-00");
        
        int opcao = 0;
        
        do {
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver Estado da Conta");
            System.out.println("4 - Ver Estado da Agência");
            System.out.println("5 - Sair");
            opcao = teclado.nextInt();
            
            if (conta.getSaldo() < 0) {
                System.out.println("Saldo não pode ser negativo");
                conta.setSaldo(0);
            }
            
            if (opcao == 1) {
                conta.Depositar();
            }
            else if (opcao == 2) {
                conta.Sacar();
            }
            else if (opcao == 3) {
                conta.EstadoAtual();
            }
            else if (opcao == 4) {
                agencia.EstadoAtual();
            }
            
        } while(opcao != 5);
        
        teclado.close();
    }
}