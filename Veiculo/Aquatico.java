public class Aquatico extends Veiculo {
	private String tipoCasco;

	public Aquatico(String cor, String tipoCasco) {
		super(cor);
		this.tipoCasco = tipoCasco;
	}

	public String getTipoCasco() {
		return tipoCasco;
	}

	public void setTipoCasco(String tipoCasco) {
		this.tipoCasco = tipoCasco;
	}
	
}   