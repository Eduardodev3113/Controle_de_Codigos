package exercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String tipo;
		int capacidade;

		System.out.println("Digite os atributos do iphone 13: ");
		System.out.println("Digite o tipo de memória RAM: ");
		tipo = teclado.next();
		System.out.println("Digite a capacidade da memória RAM: ");
		capacidade = teclado.nextInt();
		Ram ram = new Ram(tipo, capacidade);

		System.out.println("Digite a marca do processador: ");
		String marca = teclado.next();
		System.out.println("Digite o modelo do processador: ");
		String modelo = teclado.next();
		System.out.println("Digite a velocidade do processador: ");
		double velocidade = teclado.nextDouble();
		Processador processador = new Processador(marca, modelo, velocidade);

		System.out.println("Digite o tamanho da tela: ");
		int tamanho = teclado.nextInt();
		System.out.println("Digite a resolução da tela: ");
		String resolucao = teclado.next();
		Tela tela = new Tela(resolucao, tamanho);

		System.out.println("Digite a capacidade da bateria: ");
		capacidade = teclado.nextInt();
		Bateria bateria = new Bateria();

		System.out.println("Digite a resolução da câmera: ");
		capacidade = teclado.nextInt();
		String relsolucao;
		Camera camera = new Camera(relsolucao);

		SmartPhone ip13 = new SmartPhone(ram, processador, tela, bateria, camera);

		Smartphone s21 = new SmartPhone();
		System.out.println("Digite os atributos do iphone 13: ");
		System.out.println("Digite o tipo de memória RAM: ");
		s21.getRam().setTipo(teclado.next());
		System.out.println("Digite a capacidade da memória RAM: ");
		s21.getRam().setCapacidade(teclado.next());
		Ram ram = new Ram(tipo, capacidade);

		System.out.println("Digite a marca do processador: ");
		s21.getProcessador().setMarca(teclado.next());
		System.out.println("Digite o modelo do processador: ");
		s21.getProcessador().setModelo(teclado.next());
		System.out.println("Digite a velocidade do processador: ");
		
		s21.getProcessador().setVelocidade(teclado.nextDouble());
		Processador processador = new Processador(marca, modelo, velocidade);

		System.out.println("Digite o tamanho da tela: ");
		s21.getTela().setTamanho(teclado.next());
		System.out.println("Digite a resolução da tela: ");
		s21.getTela().setResolucao(teclado.next());
		Tela tela = new Tela(tamanho, resolucao);

		System.out.println("Digite a capacidade da bateria: ");
		s21.getBateria().setCapacidade(teclado.next());
		Bateria bateria = new Bateria(capacidade);

		System.out.println("Digite a resolução da câmera: ");
		s21.getCamera().setResolucao(teclado.next());
		Camera camera = new Camera(relsolucao);

		System.out.println("Iphone 13: ");
		i13.fichaTecnica();
		System.out.println("Samsung 21: ");

		s21.fichaTecnica();
	}
}
