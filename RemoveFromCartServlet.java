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
@WebServlet(name="removeFromCart",urlPatterns= "/removeFrameCart.jlc")
public class RemoveFromCartServlet extends HttpServlet{ 
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws 
	IOException,ServletException{ 
		System.out.println("------RemoveFromCartServlet--------");
	//1.Collect Input Data 
	String bname=request.getParameter("bname");
	System.out.println(bname);
	
	//2.Do Processing 
	String page="showCart.jsp";
	
	
	HttpSession session=request.getSession();
	List<String>mycart=(List<String>)session.getAttribute("Mycart");
	mycart.remove(bname);
	session.setAttribute("Mycart", mycart);
	
	System.out.println(mycart);
	//3.Forward
	RequestDispatcher rd=request.getRequestDispatcher(page); 
	rd.forward(request, response);
	} 
	}
