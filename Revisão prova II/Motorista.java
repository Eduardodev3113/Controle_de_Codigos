public class Motorista extends Pessoa{
	private String cnh;
	private Carro carro;
	
	@Override
	
	public void Mostra(String nome, String cpf) {
		System.out.println("Estado atual: " + this.getNome() + " " + this.getCpf() + " " + this.cnh + " " + this.carro.getVelocidade() + " " + this.carro.getMarcha() + " " + this.carro.getMotor().getPotencia()+ " " + this.carro.getPeso() + " " + this.carro.getMotor().getTamanho());
	
	}
	
	public void acelerarCarro() {
		this.carro.Acelerar();
	}
	
	public void FrearCarro() {
		this.carro.Frear();
	}
	
	public void marchaMaisCarro() {
		this.carro.marchaMais();
	}
	
	public void marchaMenosCarro() {
		this.carro.marchaMais();
	}

	public Motorista(String nome, String cpf, String cnh, Carro carro) {
		super(nome, cpf);
		this.cnh = cnh;
		this.carro = carro;
	}
	
	public Motorista() {
		super();
		this.cnh = "Possui";
		this.carro = new Carro();
	}
	
	
	
	
}
