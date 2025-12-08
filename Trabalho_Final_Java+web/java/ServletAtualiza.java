import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAtualiza
 */
@WebServlet("/ServletAtualiza")
public class ServletAtualiza extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ServletAtualiza() {
        super();
    }

    /**
     * Busca o alien e gera o formulário de atualização
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        String idStr = request.getParameter("id");

        if (idStr == null || idStr.trim().isEmpty()) {
            exibirErro(out, "ID do alien não fornecido!");
            return;
        }

        try {
            int id = Integer.parseInt(idStr);
            AlienDAO dao = new AlienDAO();
            Alien alien = dao.buscaPorId(id);  // Método novo no DAO
            
            if (alien != null) {
                exibirFormularioAtualizacao(out, alien);
            } else {
                exibirErro(out, "Alien não encontrado!");
            }
        } catch (NumberFormatException e) {
            exibirErro(out, "ID inválido!");
        } catch (Exception e) {
            exibirErro(out, "Erro ao buscar o alien: " + e.getMessage());
        }
    }
    /**
     * Processa a atualização do alien
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        
        PrintWriter out = response.getWriter();

        String idStr = request.getParameter("txId");
        String nome = request.getParameter("txNome");
        String poderes = request.getParameter("txPod");
        String planeta = request.getParameter("txPla");

        if (idStr == null || idStr.trim().isEmpty() ||
            nome == null || nome.trim().isEmpty() || 
            poderes == null || poderes.trim().isEmpty() || 
            planeta == null || planeta.trim().isEmpty()) {
            exibirErro(out, "Todos os campos são obrigatórios!");
            return;
        }

        try {
            int id = Integer.parseInt(idStr);
            Alien a = new Alien(id, nome.trim(), poderes.trim(), planeta.trim());
            AlienDAO dao = new AlienDAO();
            dao.atualiza(a);
            exibirSucesso(out);
        } catch (NumberFormatException e) {
            exibirErro(out, "ID inválido!");
        } catch (Exception e) {
            exibirErro(out, "Erro ao atualizar o alien: " + e.getMessage());
        }
    }

    /**
     * Gera o HTML do formulário de atualização com dados preenchidos
     */
    private void exibirFormularioAtualizacao(PrintWriter out, Alien alien) {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Atualizar Alien</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Atualizar Alien</h2>");
        out.println("<form name='fAtualiza' method='post' action='ServletAtualiza'>");
        out.println("<input type='hidden' name='txId' value='" + alien.getId() + "'>");
        out.println("<p>Nome: <input type='text' name='txNome' value='" + alien.getNome() + "' required> </p>");
        out.println("<p>Poderes: <input type='text' name='txPod' value='" + alien.getPoderes() + "' required> </p>");
        out.println("<p>Planeta: <input type='text' name='txPla' value='" + alien.getPlaneta() + "' required> </p>");
        out.println("<p><input type='submit' value='Atualizar'> </p>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    /**
     * Gera o HTML de mensagem de sucesso
     */
    private void exibirSucesso(PrintWriter out) {
        out.println("<p>Alien atualizado com sucesso!</p>");
    }

    /**
     * Gera o HTML de mensagem de erro
     */
    private void exibirErro(PrintWriter out, String mensagem) {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Erro</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Erro</h2>");
        out.println("<p style='color: red;'>" + mensagem + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}