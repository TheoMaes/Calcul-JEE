package fr.cda.TpCalculJSP.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.cda.TpCalculJSP.metier.CalculPrix;
import fr.cda.TpCalculJSP.web.CalculPrixModel;

@WebServlet(name = "CalculPrix", urlPatterns = "/calculPrix")
public class CalculPrixServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CalculPrixServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("Toto")==null) {
			response.sendRedirect("loginMDP");
		}
		else {
			String id = (String)session.getAttribute("Toto");
			CalculPrixModel model = new CalculPrixModel(0, 0, 0);
			
			request.setAttribute("id", id);
			request.setAttribute("model", model);
			request.getRequestDispatcher("CalculPrix.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("Toto");
		
		CalculPrix calculPrix = new CalculPrix();
		float prix = Float.parseFloat(request.getParameter("prix"));
		float tva = Float.parseFloat(request.getParameter("tva"));
		float resultat = calculPrix.prixTTC(prix, tva);
		
		CalculPrixModel model = new CalculPrixModel(prix, tva, resultat);
		
		request.setAttribute("id", id);
		request.setAttribute("model", model);
		request.getRequestDispatcher("CalculPrix.jsp").forward(request, response);
	}

}
