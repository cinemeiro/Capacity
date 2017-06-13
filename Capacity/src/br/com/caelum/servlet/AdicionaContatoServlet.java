package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;



@WebServlet("/adicionaContato")
public class AdicionaContatoServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String ddd = request.getParameter("ddd");
		String telefone = request.getParameter("telefone");
		String id_contrato = request.getParameter("idContrato");
		
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setCpf(cpf);
		contato.setDdd(ddd);
		contato.setTelefone(telefone);
		contato.setIdContrato(id_contrato);
		
		 ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		
		
		out.println("<htm>");
		out.println("<head>");
		out.println("<title>Primeira Servilet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Oi mundo Servlet!</h1>");
		out.println("</body>");
		out.println("</htm>");

		
	}

}
