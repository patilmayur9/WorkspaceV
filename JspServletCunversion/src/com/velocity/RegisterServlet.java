package com.velocity;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/test1")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=request.getParameter("username");
		System.out.println("User Name is : "+name);
		String pass=request.getParameter("Password");
		System.out.println("Password is : " + pass);
		if("velocity".equals(name) && "pune".equals(pass))
		{
			System.out.println("you entered correct Credentials...");
			request.setAttribute("data", name);
			RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("you are entered in-correct credentials...:");
			request.setAttribute("data", name);
			RequestDispatcher rd=request.getRequestDispatcher("Failuer.jsp");
			rd.forward(request, response);
		}
	}

}
