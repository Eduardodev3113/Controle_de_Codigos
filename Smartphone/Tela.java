package exercicios;
	
public class Tela {
	private String tamanho;
	private int resolucao;

	public Tela(String tamanho, int resolucao)

	{
		this.tamanho = tamanho;
		this.resolucao = resolucao;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getResolucao() {
		return resolucao;
	}

	public void setResolucao(int resolucao) {
		this.resolucao = resolucao;
	}

}
