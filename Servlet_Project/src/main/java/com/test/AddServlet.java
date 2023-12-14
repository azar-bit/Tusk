package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i + j;

		Cookie cookie = new Cookie("k", "" + k);
		response.addCookie(cookie);
		
		
//		HttpSession session=request.getSession();
//		session.setAttribute("k",k);
//		
////		request.setAttribute("k", k);
		response.sendRedirect("sq");
//		PrintWriter writer = response.getWriter();
//		writer.print(k);
//		RequestDispatcher rd = request.getRequestDispatcher("sq");
//		rd.forward(request, response);
//		 <servlet>
//		 <servlet-name>abc</servlet-name>
//		 <servlet-class>com.test.AddServlet</servlet-class>
//		 </servlet>
//		 <servlet-mapping>
//		 <servlet-name>abc</servlet-name>
//		 <url-pattern>/add</url-pattern>
//		 </servlet-mapping>
//		 
//		 <servlet>
//		 <servlet-name>abc2</servlet-name>
//		 <servlet-class>com.test.SqServlet</servlet-class>
//		 </servlet>
//		 <servlet-mapping>
//		 <servlet-name>abc2</servlet-name>
//		 <url-pattern>/sq</url-pattern>
//		 </servlet-mapping>

	}
}
