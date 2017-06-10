

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CareerServ
 */
@WebServlet("/CareerServ")
public class CareerServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CareerServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CareerExpert e1=new CareerExpert();
		String advice=e1.getAdvice(request.getParameter("quali"));
		request.setAttribute("qlf", advice);
		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/CareerDetails.jsp");
		rd.forward(request, response);
		
			
	
	}

}
