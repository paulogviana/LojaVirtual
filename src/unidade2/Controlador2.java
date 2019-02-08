package unidade2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
    @Override
    public void init() throws ServletException {
    ServletContext context = getServletContext();
    context.setAttribute("classe",this.getClass());
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cpf = request.getParameter("cpf");
		String senha = request.getParameter("senha");
		
		HttpSession session = request.getSession();
		session.setAttribute("cpf", cpf);
		session.setAttribute("senha", senha);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ServletLeitor");
		dispatcher.forward(request, response);
		
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
