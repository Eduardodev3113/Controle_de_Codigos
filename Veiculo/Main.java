public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Terrestre t = new Terrestre("Preto", 4);
		Aquatico a = new Aquatico("Branco", "Metal");

		System.out.println(t.getCor()+""+t.getQtbRodas());
		System.out.println(t.getCor()+""+a.getTipoCasco());
	}

}
