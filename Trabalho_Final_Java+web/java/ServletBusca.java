

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletBusca
 */
@WebServlet("/ServletBusca")
public class ServletBusca extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletBusca() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		ArrayList<Alien> listaAlien = new ArrayList<Alien>();
		
		String nome = request.getParameter("txNome");
		String poderes = request.getParameter("txPod");
		String planeta = request.getParameter("txPla");
		String id = request.getParameter("txId");
		Alien a = new Alien(nome, poderes, planeta);
		
		AlienDAO dao = new AlienDAO();
		try {
			listaAlien = dao.busca(a);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		for(int i = 0; i<listaAlien.size();i++) {
			pw.println("<h3>"+listaAlien.get(i).getNome()+"</h3>");			
			pw.println("<h3>"+listaAlien.get(i).getPoderes()+"</h3>");
			pw.println("<h3>"+listaAlien.get(i).getPlaneta()+"</h3>");
		}
	}
}
