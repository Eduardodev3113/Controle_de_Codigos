package exercicios;

public class Ram {
	private String tipo;
	private int capacidade;

	public Ram(String tipo, int capacidade)

	{
		this.tipo = tipo;
		this.capacidade = capacidade;
	}

	public Ram() {
		this.tipo = "DDR";
		this.capacidade = 2;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}