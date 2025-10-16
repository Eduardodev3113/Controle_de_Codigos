public class Televisao {
	private String marca;
	private int volume;
	private int canal;
	private boolean ligado;

	public Televisao() {
		this.marca = "LG";
		this.volume = 0;
		this.canal = 1;
		this.ligado = false;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void ligar() {
		this.ligado = true;
		System.out.println("A Tv está ligada!");
	}

	public void desligar() {
		this.ligado = false;
		System.out.println("A Tv está desligada!");
	}

	public void aumentarVolume() {
		if (this.ligado) {
			if (this.volume < 100) {
				this.volume++;
				System.out.println("O Volume foi aumentado para: " + this.volume);
			} else
				System.out.println("O Volume já está no máximo");
		} else
			System.out.println("A Tv está desligada!");

	}

	public void diminuirVolume() {
		if (this.ligado) {
			if (this.volume >= 0) {
				this.volume--;
				System.out.println("O Volume foi diminuido para: " + this.volume);
			} else
				System.out.println("O Volume já está no mínimo");
		} else
			System.out.println("A Tv está desligada!");
	}

	public void passarCanal() {
		if (this.ligado) {
			if (this.canal <= 400)
				this.canal++;
			else
				this.canal = 1;
			System.out.println("Passou o canal para: " + this.canal);
		} else
			System.out.println("A Tv está desligada!");
	}

	public void voltarCanal() {
		if (this.ligado) {
			if (this.canal >= 1)
				this.canal--;
			else
				this.canal = 400;
			System.out.println("Passou o canal para: " + this.canal);
		} else
			System.out.println("A Tv está desligada!");

	}

	public void trocarCanal(int canal) {
		if (this.ligado) {
			if (canal > 0 && canal <= 400) {
				this.canal = canal;
				System.out.println("Canal alterado para: " + this.canal);
			} else
				System.out.println("Canal Indisponível");
		} else
			System.out.println("A Tv está desligada!");

	}
	
	public void estadoAtual() {
		System.out.println("Marca: "+this.marca);
		System.out.println("Canal: "+this.canal);
		System.out.println("Volume: "+this.volume);
		System.out.println("L/D: "+this.ligado);
	}

}