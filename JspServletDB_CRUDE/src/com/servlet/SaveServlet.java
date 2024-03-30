package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
}
     */
    public SaveServlet() {
        super();
    }
        // TODO Auto-generated constructor stub

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name=request.getParameter("username");
		 System.out.println("user name is :"+ name);
		 String pass=request.getParameter("password");
		 System.out.println("Password is "+ pass);
		 
		Employee emp=new Employee();
		emp.setUsername(name);
		 emp.setPassword(pass);
		 DBUTIL.save(emp);
	}

}
