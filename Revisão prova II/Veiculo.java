	
public class Veiculo {
	private int peso;
	private Motor motor;
	
	
	public Veiculo(int peso, Motor motor) {
		this.peso = peso;
		this.motor = motor;
	}
	
	public Veiculo() {
		this.peso = 1200;
		this.motor = new Motor();
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
}
