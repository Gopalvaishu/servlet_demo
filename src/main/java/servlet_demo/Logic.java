package servlet_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/hello")
public class Logic implements Servlet {
	
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fn=req.getParameter("fn");//getparameter return type is string and req is object of sevlet request
		String ln=req.getParameter("ln");//getparameter return type is string
		System.out.println("Godd Evening "+fn+" "+ln);
				System.out.println("Hello");//To print in the console
				//res.getWriter().print("Godd Evening "+fn+" "+ln);// print stmt to print in the values in the front end
				
				PrintWriter out=res.getWriter();
				out.print("<h1 style='color:red'>Goodddd Evening "+fn+"  "+ln+"</h1>");
				
				
	//	System-class
	//out-reference variable
	//println-
				//printString-
	}


	

}
