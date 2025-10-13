public class Conta {
    private int numag;
    private int numconta;
    private double saldo;
    private String cpf;
    private static int totalContas = 0;
    
    // Construtor padrão
    public Conta() {
        this.numag = 1;
        this.numconta = ++totalContas;
        this.saldo = 0.0;
        this.cpf = "000.000.000-00";
    }
    
    // Construtor parametrizado
    public Conta(int numag, double saldo, String cpf) {
        super();
        this.numag = numag;
        this.numconta = ++totalContas;
        this.saldo = saldo;
        this.cpf = cpf;
    }
    
    // Getters e Setters
    public int getNumag() {
        return numag;
    }
    
    public void setNumag(int numag) {
        this.numag = numag;
    }
    
    public int getNumconta() {
        return numconta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public static int getTotalContas() {
        return totalContas;
    }
    
    public void Depositar() {
        this.saldo += 100;
    }
    
    public void Sacar() {
        this.saldo -= 50;
    }
    
    public void EstadoAtual() {
        System.out.println("Número da Agência: " + this.numag);
        System.out.println("Número da Conta: " + this.numconta);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Saldo: R$ " + this.saldo);
    }
}

public class Agencia {
    private int numag;
    private String endereco;
    private String telefone;
    private String nomeGerente;
    private static int totalAgencias = 0;
    
    // Construtor padrão
    public Agencia() {
        this.numag = ++totalAgencias;
        this.endereco = "Rua Principal, 123";
        this.telefone = "(11) 1234-5678";
        this.nomeGerente = "Gerente Padrão";
    }
    
    // Construtor parametrizado
    public Agencia(String endereco, String telefone, String nomeGerente) {
        super();
        this.numag = ++totalAgencias;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nomeGerente = nomeGerente;
    }
    
    // Getters e Setters
    public int getNumag() {
        return numag;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getNomeGerente() {
        return nomeGerente;
    }
    
    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }
    
    public static int getTotalAgencias() {
        return totalAgencias;
    }
    
    public void EstadoAtual() {
        System.out.println("Número da Agência: " + this.numag);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Nome do Gerente: " + this.nomeGerente);
    }
}