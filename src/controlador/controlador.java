package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class controlador
 */
@WebServlet("/controlador")
public class controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public controlador() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// criar as variaveis para saber qual pagina esta tratando

		// 1=clientes
		// 2=cursos
		// 3=pagamentos
		int idformulario;

		// 1.1 = consulta
		int tipoformulario;

		idformulario = Integer.parseInt(request.getParameter("idformulario"));
		tipoformulario = Integer.parseInt(request
				.getParameter("tipoformulario"));
		String cpfMascara;
		Long cpf;
		String nome;
		String email;

		String cdCurso;
		String nomeCurso;
		String valorCurso;
		String siteCurso;

		if (idformulario == 1) // clientes
		{

			switch (tipoformulario) {

			// consultar todos
			case 11:

				break;

			// consultar um
			case 12:
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]", "");
				cpf = Long.parseLong(cpfMascara);
				out.println("<h2> CONSULTA DE CLIENTE");
				out.println("<br>");
				out.println("<h2> CPF: " + cpfMascara);

				break;

			// cadastrar
			case 13:
				cpfMascara = request.getParameter("cpf");
				nome = request.getParameter("nome");
				email = request.getParameter("email");

				cpfMascara = cpfMascara.replaceAll("[.-]", "");
				cpf = Long.parseLong(cpfMascara);
				out.println("<h2> CADASTRO DE CLIENTE");
				out.println("<br>");
				out.println("<h2> CPF: " + cpfMascara);
				out.println("<br>");
				out.println("<h2> NOME: " + nome);
				out.println("<br>");
				out.println("<h2> EMAIL: " + email);
				break;

			// alterar
			case 14:
				cpfMascara = request.getParameter("cpf");
				nome = request.getParameter("nome");
				email = request.getParameter("email");

				cpfMascara = cpfMascara.replaceAll("[.-]", "");
				cpf = Long.parseLong(cpfMascara);
				out.println("<h2> ALTERAÇÃO DE CLIENTE");
				out.println("<br>");
				out.println("<h2> CPF: " + cpfMascara);
				out.println("<br>");
				out.println("<h2> NOME: " + nome);
				out.println("<br>");
				out.println("<h2> EMAIL: " + email);

				break;

			// excluir
			case 15:
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]", "");
				cpf = Long.parseLong(cpfMascara);
				out.println("<h2> EXCLUSÃO DE CLIENTE");
				out.println("<br>");
				out.println("<h2> CPF: " + cpfMascara);

				break;

			}

		}

		if (idformulario == 2) // cursos
		{
			switch (tipoformulario) {

			// consultar todos
			case 21:

				break;

			// consultar um
			case 22:
				cdCurso = request.getParameter("cdCurso");
				
				out.println("<h2> CONSULTA DE CURSO");
				out.println("<br>");
				out.println("<h2> CDCURSO: " + cdCurso);

				break;

			// cadastrar
			case 23:
				cdCurso = request.getParameter("cdCurso");
				nomeCurso = request.getParameter("nomeCurso");
				valorCurso = request.getParameter("valorCurso");
				siteCurso = request.getParameter("siteCurso");

				out.println("<h2> CADASTRO DE CURSOS");
				out.println("<br>");
				out.println("<h2> CÓDIGO: " + cdCurso);
				out.println("<br>");
				out.println("<h2> NOME: " + nomeCurso);
				out.println("<br>");
				out.println("<h2> VALOR: " + valorCurso);
				out.println("<br>");
				out.println("<h2> SITE: " + siteCurso);
				break;

			// alterar
			case 24:
				cdCurso = request.getParameter("cdCurso");
				nomeCurso = request.getParameter("nomeCurso");
				valorCurso = request.getParameter("valorCurso");
				siteCurso = request.getParameter("siteCurso");

				out.println("<h2> ALTERAÇÃO DE CURSOS");
				out.println("<br>");
				out.println("<h2> CÓDIGO: " + cdCurso);
				out.println("<br>");
				out.println("<h2> NOME: " + nomeCurso);
				out.println("<br>");
				out.println("<h2> VALOR: " + valorCurso);
				out.println("<br>");
				out.println("<h2> SITE: " + siteCurso);

				break;

			// excluir
			case 25:
				cdCurso = request.getParameter("cdCurso");
				out.println("<h2> EXCLUSÃO DE CURSOS");
				out.println("<br>");
				out.println("<h2> CÓDIGO: " + cdCurso);

				break;

			}
		}

		if (idformulario == 3)// pagamentos
		{
			switch (tipoformulario) {

			// consultar todos
			case 31:

				break;

			// consultar um
			case 32:
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]", "");
				cpf = Long.parseLong(cpfMascara);
				out.println("<h2> CONSULTA DE CLIENTE");
				out.println("<br>");
				out.println("<h2> CPF: " + cpfMascara);

				break;

			// cadastrar
			case 33:
				cpfMascara = request.getParameter("cpf");
				nome = request.getParameter("nome");
				email = request.getParameter("email");

				cpfMascara = cpfMascara.replaceAll("[.-]", "");
				cpf = Long.parseLong(cpfMascara);
				out.println("<h2> CADASTRO DE CLIENTE");
				out.println("<br>");
				out.println("<h2> CPF: " + cpfMascara);
				out.println("<br>");
				out.println("<h2> NOME: " + nome);
				out.println("<br>");
				out.println("<h2> EMAIL: " + email);
				break;

			// alterar
			case 34:
				cpfMascara = request.getParameter("cpf");
				nome = request.getParameter("nome");
				email = request.getParameter("email");

				cpfMascara = cpfMascara.replaceAll("[.-]", "");
				cpf = Long.parseLong(cpfMascara);
				out.println("<h2> ALTERAÇÃO DE CLIENTE");
				out.println("<br>");
				out.println("<h2> CPF: " + cpfMascara);
				out.println("<br>");
				out.println("<h2> NOME: " + nome);
				out.println("<br>");
				out.println("<h2> EMAIL: " + email);

				break;

			// excluir
			case 35:
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]", "");
				cpf = Long.parseLong(cpfMascara);
				out.println("<h2> EXCLUSÃO DE CLIENTE");
				out.println("<br>");
				out.println("<h2> CPF: " + cpfMascara);

				break;

			}
		}

	}

}
