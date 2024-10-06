package com.jlcindia.servlets;
import java.io.IOException;
import javax.servlet.http.HttpSession; 
 
 import java.util.List;
 import java.util.ArrayList;
 import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
@WebServlet(name="value",urlPatterns= {"/searchBooks.jlc"})
public class SearchBooksServlet extends HttpServlet{ 
	public void service(HttpServletRequest request, HttpServletResponse response) throws 
	IOException,ServletException{ 
		System.out.println("----SearchBooksServlet-----");
		
	//1.Collect Input Data 
	String cat=request.getParameter("catagory");
	System.out.println(cat);
	
	//2.Do Processing
	HttpSession session=request.getSession();
	session.setAttribute("CAT", cat);
	
	//Make empty cart ready
	List<String>mycart1=(List<String>)session.getAttribute("Mycart");
	if(mycart1==null) {
	List<String>mycart=new  ArrayList<>();
	session.setAttribute("Mycart",mycart);
	}
	List<String>blist=new ArrayList<>();
	String msg="";
	String page="";
	if(cat==null||cat.length()==0) {
		msg="Please select category";
		request.setAttribute("MSG", msg);
		page="index.jsp";
	}else if(cat.equals("java")) {
		blist.add("Master Java8");
		blist.add("Master Spring5");
		blist.add("Master Hibernate");
		blist.add("Master MicroServices");
		
		session.setAttribute("BooksList", blist);//***IMP
		page="showBooks.jsp";
	}else if(cat.equals("web")) {
		blist.add("javaScript");
		blist.add("Angular");
		blist.add("React JS");
		blist.add("Learn React");
		
		session.setAttribute("BooksList", blist);
		page="showBooks.jsp";
	}else if(cat.equals("python")) {
		msg="Sorry No Books for "+cat;
		request.setAttribute("MSG", msg); 
		page="index.jsp";
	}
	
	
	
	//3.Forward

	RequestDispatcher rd=request.getRequestDispatcher(page); 
	rd.forward(request, response);
	} 
	}
