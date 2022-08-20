package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Pessoa;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/pessoa")
public class PessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PessoaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idParam = request.getParameter("txtId");
		String nome = request.getParameter("txtNome");
		String dateParam = request.getParameter("dtDataNasc");
		
		Pessoa p = new Pessoa();
		p.setId(Integer.parseInt(idParam));
		p.setNome(nome);
		p.setDataNasc(Date.valueOf(dateParam));
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p);
		
		Pessoa p2 = new Pessoa();
		p2.setId(Integer.parseInt("2"));
		p2.setNome("Roberto");
		p2.setDataNasc(Date.valueOf("2000-06-07"));
		pessoas.add(p2);
		
		RequestDispatcher rd = request.getRequestDispatcher("cadastro.jsp");
		request.setAttribute("pessoa", p);
		request.setAttribute("pessoas", pessoas);
		
		rd.forward(request, response);
	}

}
