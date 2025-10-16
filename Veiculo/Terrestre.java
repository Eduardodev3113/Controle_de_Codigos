public class Terrestre extends Veiculo {
	private int qtbRodas;

	public Terrestre(String cor, int qtbRodas) {
		super(cor);
		this.qtbRodas = qtbRodas;

	}

	public int getQtbRodas() {
		return qtbRodas;
	}

	public void setQtbRodas(int qtbRodas) {
		this.qtbRodas = qtbRodas;
	}
}