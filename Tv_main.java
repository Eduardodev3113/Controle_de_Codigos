import java.util.Scanner;

public class Tv_main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Televisao minhaTv = new Televisao();
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Ligar TV");
            System.out.println("0 - Desligar TV");
            System.out.println("2 - Aumentar volume");
            System.out.println("3 - Diminuir volume");
            System.out.println("4 - Passar canal");
            System.out.println("5 - Voltar canal");
            System.out.println("6 - Alterar marca da TV");
            System.out.println("7 - Mostrar estado atual");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch(opcao) {
                case 1:
                    minhaTv.ligar();
                    break;
                case 0:
                    minhaTv.desligar();
                    break;
                case 2:
                    minhaTv.aumentarVolume();
                    break;
                case 3:
                    minhaTv.diminuirVolume();
                    break;
                case 4:
                    minhaTv.passarCanal();
                    break;
                case 5:
                    minhaTv.voltarCanal();
                    break;
                case 6:
                    System.out.print("Digite o novo nome da TV: ");
                    String novaMarca = scanner.next();
                    minhaTv.setMarca(novaMarca);
                    break;
                case 7:
                    minhaTv.estadoAtual();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 8);
        
        scanner.close();
    }

}
