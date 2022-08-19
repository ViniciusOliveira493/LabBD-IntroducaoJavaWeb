package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Pessoa;

import java.io.IOException;
import java.sql.Date;

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
		System.out.println(p);
	}

}
