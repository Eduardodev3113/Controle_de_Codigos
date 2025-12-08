import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// A anotação @WebServlet foi alterada para refletir o novo nome
@WebServlet("/ServletBuscaTodos") 
public class ServletBuscaTodos extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ServletBuscaTodos() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        try {
            AlienDAO dao = new AlienDAO();
            List<Alien> aliens = dao.buscaTodos(); // Chama o método do DAO
            
            exibirTabela(out, aliens);
            
        } catch (Exception e) {
            out.println("<h2>Erro ao buscar todos os aliens:</h2>");
            out.println("<p style='color: red;'>" + e.getMessage() + "</p>");
            e.printStackTrace(out);
        }
    }
    
    /**
     * Gera o HTML para exibir a lista de aliens em uma tabela.
     */
    private void exibirTabela(PrintWriter out, List<Alien> aliens) {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Lista de Aliens</title>");
        out.println("<style>");
        out.println("table, th, td { border: 1px solid black; border-collapse: collapse; padding: 8px; }");
        out.println("th { background-color: #f2f2f2; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Aliens Cadastrados</h2>");
        
        if (aliens.isEmpty()) {
            out.println("<p>Nenhum alien encontrado no banco de dados.</p>");
        } else {
            out.println("<table>");
            out.println("<tr><th>ID</th><th>Nome</th><th>Poderes</th><th>Planeta</th></tr>");
            
            for (Alien a : aliens) {
                out.println("<tr>");
                out.println("<td>" + a.getId() + "</td>");
                out.println("<td>" + a.getNome() + "</td>");
                out.println("<td>" + a.getPoderes() + "</td>");
                out.println("<td>" + a.getPlaneta() + "</td>");
                out.println("</tr>");
            }
            
            out.println("</table>");
        }
        
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        doGet(request, response);
    }
}