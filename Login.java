public class Login {
	private String Nome;
	String Senha;
	public String NomePagina;

	public Login(String nome, String Senha, String nomePagina) {
		super();
		Nome = nome;
		Senha = Senha;
		this.NomePagina = nomePagina;
		if (!this.validaLogin()) {
			this.Senha = Senha;
		} else {
			System.out.println("Foi atribuída uma Senha padrão 'AAAA'");
			this.Senha = "AAAA";
		}
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String Senha) {
		Senha = Senha;
	}

	public String getNomePagina() {
		return NomePagina;
	}

	public void setNomePagina(String nomePagina) {
		this.NomePagina = nomePagina;
	}

	private boolean validaLogin() {
		boolean r = false;
		if (this.Senha.length() == 4) {
			r = true;
			System.out.println("Sucesso!");
		}

		else
			System.out.println("Falha de login, verifique sua senha!");
		return r;

	}
}