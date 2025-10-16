public class Bolsista extends Aluno{
	private String projeto;
	private String Disciplina;
	public Bolsista(String nome, int matricula, String projeto, String disciplina) {
		super(nome, matricula);
		this.projeto = projeto;
		Disciplina = disciplina;
	}
	public String getProjeto() {
		return projeto;
	}
	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	public String getDisciplina() {
		return Disciplina;
	}
	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}
	
}   