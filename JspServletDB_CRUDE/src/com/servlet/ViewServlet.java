package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ShowServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out=response.getWriter();
		out.print("<h1> Employee List <br></h1>");
		List<Employee> list=DBUTIL.getAllEmployee();
		System.out.println(list);
		
		out.print("<table border=1 width='100%'>");
		out.print("<tr> "
				+ "<th>ID</th> "
				+ "<th>UserName</th>"
				+ "<th>Password</th>"
				+ "<th>Delete</th>"
				+ "</tr>");
		 
		for(Employee e:list)
		{
			out.print("<tr>"
					+ " <td>"+e.getId()+"</td> "
					+ "<td>"+e.getUsername()+"</td>"
					+ " <td>"+e.getPassword()+"</td> "
					+ "<td><a href='DeleteServlet?id="+e.getId()+"'>Delete</td>"
					+ "</tr> ");
		}
		out.print("</table>");
	}

}
