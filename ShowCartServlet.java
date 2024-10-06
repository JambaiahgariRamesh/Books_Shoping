package com.jlcindia.servlets;
import java.io.IOException; 
 
 import java.util.List;
 import java.util.ArrayList;
 import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
@WebServlet(name="showMycart",urlPatterns= "/showMycart.jlc")
public class ShowCartServlet extends HttpServlet{ 
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws 
	IOException,ServletException{ 
		System.out.println("------showMycart--------");
	
	//No input Data
	//2.Do Processing 
	String page="showCart.jsp";
	
	
	//3.Forward
	RequestDispatcher rd=request.getRequestDispatcher(page); 
	rd.forward(request, response);
	} 
	}
