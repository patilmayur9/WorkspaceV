package com.arithmatic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=j+i;
		// res.getWriter().println("Result is "+k);
		// System.out.println("Addition of two Number is "+ k);
		
		//call one servlet to another servlet
//		 req.setAttribute("k", k); //"k" used to maping purpose and second k is used for pass the actual value
//		 RequestDispatcher rd=req.getRequestDispatcher("sq");
//		 rd.forward(req, res);
		
		//send redirect 
		res.sendRedirect("sq?k="+k);
	}
}
