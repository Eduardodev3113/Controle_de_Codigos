
public class Main {

	public static void main(String[] args) {
		int cont = 0;
		String palavra = "exemplo";
		Motor mm = new Motor(1, 2.2);
		Carro carro = new Carro(1200, mm, 0, 1 );
		Motorista m = new Motorista("João", "8237513485", "Possui", carro);
		
		System.out.println(m.getNome().toLowerCase());
		System.out.println(m.getNome().toUpperCase());
		palavra = m.getNome().toLowerCase();
		for (int i = 0; i < palavra.length(); i++) {
			
			switch(palavra.charAt(i)){
			case 'a':
			case 'e':	
			case 'i':
			case 'o':
			case 'u':
				cont++;
				break;
			}
		}
		System.out.println("A palavra " + palavra + "tem " + cont + " vogais.");
		
		if (palavra != "Paulo") {
			System.out.println("o nome" + palavra + "é diferente de Paulo");
		}
		
		m.acelerarCarro();
		carro.Mostra();
		m.marchaMaisCarro();
		carro.Mostra();
		m.acelerarCarro();
		carro.Mostra();
		m.FrearCarro();
		carro.Mostra();
		m.marchaMenosCarro();
		carro.Mostra();
	}

}
