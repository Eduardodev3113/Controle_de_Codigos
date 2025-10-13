public class Carro {
	private String nome;
	private int marcha;
	private int velocidade;
	private float potencia;

	public Carro() {
		this.nome = "Uno";
		this.velocidade = 0;
		this.marcha = 1;
		this.potencia = 100;
	}

	public Carro(String nome, int marcha, int velocidade, float potencia) {
		super();
		this.nome = nome;
		this.marcha = marcha;
		this.velocidade = velocidade;
		this.potencia = potencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	public void Acelerar() {
		this.velocidade += 10;
	}
	public void Frear() {
		this.velocidade-=10;
		
	}
	public void AumentarMarcha() {
		this.marcha +=1;
	}
	public void DiminuirMarcha() {
		this.marcha -=1;
	}

	public void EstadoAtual() {
		System.out.println("Nome: "+this.nome);
		System.out.println("CV: "+this.potencia);
		System.out.println("Velocidade: "+this.velocidade+"Km/h");
		System.out.println("Marcha: "+this.marcha);
		
	}
	
}
