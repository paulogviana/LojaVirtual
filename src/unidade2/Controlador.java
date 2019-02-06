package unidade2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cpf = request.getParameter("cpf");
		String senha = request.getParameter("senha");
		
		PrintWriter out = response.getWriter(); 
		out.println("<HTML>"); 
		out.println("<HEAD><TITLE>Servlet</TITLE></HEAD>");
		out.println("<BODY>"); 
		out.println(" CPF logado:" + cpf);
			out.println("</br>");
			out.println(" Senha:" + senha);
			
		out.println("  </BODY>"); 
		out.println("</HTML>");
		out.flush(); out.close();
	}

}
