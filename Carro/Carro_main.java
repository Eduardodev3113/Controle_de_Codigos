import java.util.Scanner;

public class Carro_main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Carro c = new Carro();
		int opcao = 0;
		do {
			System.out.println("1 - Acelerar");
			System.out.println("2 - Frear");
			System.out.println("3 - Aumentar Marcha");
			System.out.println("4 - Diminuir Marcha");
			System.out.println("5 - Sair");
			opcao = teclado.nextInt();
			if (c.getMarcha() == 0) {
				System.out.println("Não é possivel ter a marcha 0");
				c.AumentarMarcha();
			}
			if (c.getMarcha() >= 6) {
				System.out.println("O carro só tem 6 marchas");
				c.DiminuirMarcha();
			}

			
			if (opcao == 1) {
				c.Acelerar();
			}
			else if (opcao == 2) {
				c.Frear();
			}
			if (opcao == 3) {
				c.AumentarMarcha();
			}
			else if (opcao == 4) {
				c.DiminuirMarcha();
			}
			c.EstadoAtual();
		}while(opcao != 5);
		
	}

}