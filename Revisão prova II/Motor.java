
public class Motor {
	private int potencia;
	private double tamanho;
	
	public Motor(int potencia, double tamanho) {
		this.potencia = potencia;
		this.tamanho = tamanho;
	}
	
	public Motor() {
		this.potencia = 2;
		this.tamanho = 10;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	
	
}
