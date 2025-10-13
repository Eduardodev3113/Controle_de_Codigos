package exercicios;

public class Smartphone {
	private Ram ram;
	private Processador processador;
	private Tela tela;
	private Bateria bateria;
	private Camera camera;

	public Smartphone(Ram ram, Processador processador, Tela tela, Bateria bateria, Camera camera) {

		this.ram = ram;
		this.processador = processador;
		this.tela = tela;
		this.bateria = bateria;
		this.camera = camera;
	}

	public Smartphone() {
		this.ram = new Ram();
		this.processador = new Processador();
		this.tela = new Tela();
		this.bateria = new Bateria();
		this.camera = new Camera();
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Processador getProcessador() {
		return processador;
	}

	public void setProcessador(Processador processador) {
		this.processador = processador;
	}

	public Tela getTela() {
		return tela;
	}

	public void setTela(Tela tela) {
		this.tela = tela;
	}

	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	public void fichaTecnica() {
		System.out.println("Ram Tipo: "+this.getRam().getTipo());
		System.out.println("Ram Capacidade: "+this.getRam().getCapacidade());
		System.out.println("Processador Marca: "+this.getProcessador().getMarca());
		System.out.println("Processador Modelo: "+this.getProcessador().getModelo());
		System.out.println("Processador Velocidade: "+this.getProcessador().getVelocidade());
		System.out.println("Tela Resolução: "+this.getTela().getResolucao());
		System.out.println("Tela Tamanho: "+this.getTela().getTamanho());
		System.out.println("Bateria Capacidade: "+this.getBateria().getCapacidade());
		System.out.println("Processador Resolucao: "+this.getCamera().getResolucao());
	}
}

