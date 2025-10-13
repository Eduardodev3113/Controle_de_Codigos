package exercicios;

public class Processador {
	private String marca;
	private int modelo;
	private int velocidade;

	public Processador(String marca, int modelo, int velocidade)

	{
		this.marca = marca;
		this.modelo = modelo;
		this.velocidade = velocidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

}
