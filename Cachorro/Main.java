public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro c1 = new Cachorro();
		Cachorro c2 = new Cachorro("Bolt");
		Cachorro c3 = new Cachorro("Rex", 4);
		Cachorro c4 = new Cachorro("Luna", 6, "Labrador");
		
		System.out.println("Contrutor 1: ");
		System.out.println("Construtor 2: " + c2.getNome());
		System.out.println("Construtor 3: " + c3.getNome()+ " " + c3.getIdade());
		System.out.println("Construtor 4: " + c4.getNome() + " " + c4.getIdade() + " " + c4.getRaca());
	}

}

