package com.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/test1")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*String username=request.getParameter("name");
		System.out.println("User Name is : "+username);
		String password=request.getParameter("pass");
		System.out.println("Password is : "+password);
		if("velocity".equals(username) && "pune".equals(password))
		{
			System.out.println("you entered correct Credentials...");
			request.setAttribute("data", username);
			RequestDispatcher rd=request.getRequestDispatcher("Sucess.jsp");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("you are entered in-correct credentials...:");
			RequestDispatcher rd=request.getRequestDispatcher("Failuer.jsp");
			rd.forward(request, response);
		}
		*/
		String name = request.getParameter("username");
		System.out.println("name>>" + name);
		String pass = request.getParameter("password");
		System.out.println("pass>>" + pass);
		if ("velocity".equals(name) && "pune".equals(pass)) {
		System.out.println("you have entered correct credentials...");
		request.setAttribute("data", name); //Here we are sending the name to success.jsp page.
		RequestDispatcher 
		rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
		} else {
		System.out.println("Invalid username and password");
		RequestDispatcher 
		rd=request.getRequestDispatcher("failure.jsp");
		rd.forward(request, response);
		
		}
		
		// TODO Auto-generated method stub
	}

}
