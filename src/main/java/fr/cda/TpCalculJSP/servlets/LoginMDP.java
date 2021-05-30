package fr.cda.TpCalculJSP.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.cda.TpCalculJSP.metier.VerifMDP;
import fr.cda.TpCalculJSP.web.VerifMDPModel;

@WebServlet(name = "LoginMDP", urlPatterns = "/loginMDP")
public class LoginMDP extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginMDP() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		session.removeAttribute("Toto");
		
		VerifMDPModel model = new VerifMDPModel("", "");
		
		request.setAttribute("model", model);
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String mdp = request.getParameter("mdp");
		VerifMDP verif = new VerifMDP();
		
		if(!verif.verifMDP(login, mdp)) {
			VerifMDPModel model = new VerifMDPModel(login, mdp);
			
			request.setAttribute("model", model);
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		else {
			
			HttpSession session = request.getSession(false);
			
			session.setAttribute("Toto", login);
			response.sendRedirect("accueil");
		}

		
	}

}
