import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlienDAO {
    String url = "jdbc:postgresql://localhost:5432/omnitrix";
    private Connection connection;
    private String user = "postgres";
    private String senha = "aluno";

    // M�todo para cadastrar um novo Alien
    public void cadastra(Alien a) throws ClassNotFoundException {
        String sql = "insert into alien(nome, poderes, planeta) values(?, ?, ?)";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, senha);
            
            // prepared statement para inser��o
            PreparedStatement stmt = connection.prepareStatement(sql);
            // seta os valores
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getPoderes());
            stmt.setString(3, a.getPlaneta());
            
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // M�todo para buscar um Alien espec�fico pelo nome
    public ArrayList<Alien> busca(Alien a) throws ClassNotFoundException {
        ArrayList<Alien> listaAlien = new ArrayList<Alien>();
        String sql = "select * from alien where nome = ?";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, senha);
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, a.getNome());
            
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                Alien d = new Alien(res.getString("nome"), res.getString("poderes"), res.getString("planeta"));
                listaAlien.add(d);
            }
            res.close();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();  // Ideal adicionar algum tipo de log ou mensagem de erro
        }
        return listaAlien;
    }

    public ArrayList<Alien> buscaTodos() throws ClassNotFoundException {
        
        // Lista onde os aliens serão armazenados
        ArrayList<Alien> listaAlien = new ArrayList<>();
        
        // SQL: Seleciona todas as colunas da tabela 'alien'
        String sql = "SELECT id, nome, poderes, planeta FROM alien ORDER BY id";
        
        // 1. Carrega o Driver (Requerido para JDBC)
        // Se você estiver usando PostgreSQL, ajuste o nome da classe do driver
        Class.forName("org.postgresql.Driver"); 
        
        // 2. Uso do try-with-resources para garantir que Connection, PreparedStatement e ResultSet sejam fechados
        try (Connection connection = DriverManager.getConnection(url, user, senha);
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet res = stmt.executeQuery()) { // O ResultSet é criado e gerenciado no try-with-resources
            
            // Mapeamento dos resultados
            while (res.next()) {
                // 3. Mapeamento: Garanta que o construtor Alien e os tipos/ordem das colunas estejam corretos
                Alien d = new Alien(
                    res.getInt("id"),         // Assumindo que o ID é o primeiro parâmetro do construtor
                    res.getString("nome"),
                    res.getString("poderes"), 
                    res.getString("planeta")
                );
                listaAlien.add(d);
            }
            
        } catch (SQLException e) {
            // Loga o erro, mas não o silencia. 
            // O ideal é lançar uma RuntimeException ou Exception customizada aqui.
            e.printStackTrace(); 
            throw new RuntimeException("Erro ao buscar todos os aliens no banco de dados.", e);
        }
        
        return listaAlien;
    }

    // Supondo que você está em AlienDAO e já trata ClassNotFoundException
    public void atualiza(Alien alien) throws ClassNotFoundException { 
        
        // 1. CORRIGIDO: Porta e Credenciais do PostgreSQL
        String url = "jdbc:postgresql://localhost:5432/omnitrix"; // Porta padrão do PostgreSQL é 5432, não 3306 (MySQL)
        String user = "postgres";  // Usuário padrão comum, altere se for diferente
        String password = "aluno"; // Altere para a senha real do seu BD
        
        try {
            // 2. CORRIGIDO: Nome do Driver do PostgreSQL
            Class.forName("org.postgresql.Driver"); // O nome do driver é 'org.postgresql.Driver'
            
            try (Connection con = DriverManager.getConnection(url, user, password)) {
                
                // Comando SQL está correto
                String sql = "UPDATE alien SET nome=?, poderes=?, planeta=? WHERE id=?";
                try (PreparedStatement stmt = con.prepareStatement(sql)) {
                    
                    stmt.setString(1, alien.getNome());
                    stmt.setString(2, alien.getPoderes());
                    stmt.setString(3, alien.getPlaneta());
                    stmt.setInt(4, alien.getId());
                    
                    stmt.executeUpdate();
                    
                } // stmt.close() é chamado automaticamente pelo try-with-resources
            } // con.close() é chamado automaticamente pelo try-with-resources
            
        } catch (SQLException e) {
            e.printStackTrace();
            // 3. CORRIGIDO: Lançar RuntimeException após imprimir o stack trace
            throw new RuntimeException("Erro ao atualizar alien: " + e.getMessage(), e); // Inclui a causa original (e)
        }
    }
    
    // M�todo para excluir um Alien
    public void exclui(Alien a) throws ClassNotFoundException {
        String sql = "DELETE FROM alien WHERE nome = ?";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, senha);
            
            // prepared statement para exclus�o
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, a.getNome());
            
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
    
        }
    }
    
    public Alien buscaPorId(int id) throws ClassNotFoundException {
        String url = "jdbc:postgresql://localhost:5432/omnitrix";  // MUDE para seu banco
        String user = "postgres";  // MUDE para seu usuário
        String password = "aluno";  // MUDE para sua senha
        Alien alien = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            
            String sql = "SELECT id, nome, poderes, planeta FROM alien WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()) {
                alien = new Alien(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("poderes"),
                    rs.getString("planeta")
                );
            }
            
            rs.close();
            stmt.close();
            con.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return alien;
    }
    
}
