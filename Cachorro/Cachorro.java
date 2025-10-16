public class Cachorro {
	
	private String nome;
	private int idade;
	private String raca;
	
	// Construtor 1 - sem parâmetros
	public Cachorro() {
		this.nome = "desconhecido";
		this.idade = 0;
		this.raca = "SRC";
	}
	
	// Construtor 2 - só com nome
	public Cachorro(String nome) {
		this.nome = nome;
		this.idade = 0;
		this.raca = "SRC";
	}
	
	// Construtor 3 - com nome e idade
	public Cachorro(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.raca = "SRC";
	}
	
	// Construtor 4 - com nome, idade e raça
	public Cachorro(String nome, int idade, String raca) {
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
	}
	
	// Métodos getters e setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
}
