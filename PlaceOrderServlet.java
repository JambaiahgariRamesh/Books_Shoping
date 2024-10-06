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
//import javax.security.auth.message.callback.PrivateKeyCallback.Request;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
@WebServlet(name="placeOrder",urlPatterns= "/placeOrder.jlc")
public class PlaceOrderServlet extends HttpServlet{ 
 public void service(HttpServletRequest request, HttpServletResponse response) 
throws IOException,ServletException{ 
 System.out.println("----PlaceOrderServlet---"); 
 //1. No Input data 
 
 //2.Do Processing 
 String page="placeOrder.jsp"; 
 HttpSession session = request.getSession(); 
 session.removeAttribute("Mycart"); 
 
 List<String> mycart = new ArrayList<>(); 
 session.setAttribute("Mycart", mycart); 
 
 //3.Forward 
 RequestDispatcher rd=request.getRequestDispatcher(page); 
 rd.forward(request, response); 
 } 
}
