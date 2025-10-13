import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		num1 = teclado.nextInt();
		System.out.println("Digite outro número inteiro: ");
		num2 = teclado.nextInt();
		soma = num1 + num2;
		System.out.println("Soma é igual a: "+ soma);
	}

}