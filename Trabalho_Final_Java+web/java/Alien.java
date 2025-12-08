public class Alien {
    private int id;  // ADICIONAR ESTE CAMPO
    private String nome;
    private String poderes;
    private String planeta;
    
    // Construtor com ID
    public Alien(int id, String nome, String poderes, String planeta) {
        this.id = id;
        this.nome = nome;
        this.poderes = poderes;
        this.planeta = planeta;
    }
    
    // Construtor sem ID (manter para compatibilidade)
    public Alien(String nome, String poderes, String planeta) {
        this.nome = nome;
        this.poderes = poderes;
        this.planeta = planeta;
    }
    
    // Getters e Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getPoderes() {
        return poderes;
    }
    
    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }
    
    public String getPlaneta() {
        return planeta;
    }
    
    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }
}