package fr.cda.TpCalculJSP.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.cda.TpCalculJSP.metier.Calcul;
import fr.cda.TpCalculJSP.web.CalculModel;

@WebServlet(name = "Calcul", urlPatterns = "/calcul")
public class CalculServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public CalculServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("Toto")==null) {
			response.sendRedirect("loginMDP");
		}
		else {
			String id = (String)session.getAttribute("Toto");
			CalculModel model = new CalculModel(0, 0, 0);
			
			request.setAttribute("id", id);
			request.setAttribute("model", model);
			request.getRequestDispatcher("Calcul.jsp").forward(request, response);
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("Toto");
		
		Calcul calcul = new Calcul();
		
		int nombre1 = Integer.parseInt(request.getParameter("nombre1"));
		int nombre2 = Integer.parseInt(request.getParameter("nombre2"));
		int resultat = calcul.addition(nombre1, nombre2);
		
		CalculModel model = new CalculModel(nombre1, nombre2, resultat);
		
		request.setAttribute("id", id);
		request.setAttribute("model", model);
		request.getRequestDispatcher("Calcul.jsp").forward(request, response);
	}

}
