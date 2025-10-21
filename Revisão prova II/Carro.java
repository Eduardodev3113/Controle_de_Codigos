
public class Carro extends Veiculo{
	private int velocidade;
	private int marcha;
	
	
	public void Mostra() {
		System.out.println("Estado atual: " + this.velocidade + " " + this.marcha);
	}
	
	public void Acelerar() {
		this.velocidade += 1;
	}
	
	public void Frear() {
		this.velocidade -= 1;
	}
	
	public void marchaMais() {
		this.marcha += 1;
	}
	
	public void marchaMenos() {
		this.marcha -= 1;
	}

	public Carro(int peso, Motor motor, int velocidade, int marcha) {
		super(peso, motor);
		this.velocidade = velocidade;
		this.marcha = marcha;
	}
	
	public Carro() {
		super();
		this.velocidade = 1;
		this.marcha = 1;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
}

