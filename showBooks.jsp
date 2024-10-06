<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<%@page import="java.util.List"%>
<html>
<head>
<style>
table{
width:90%;
border:2px solid red;
border-collapse:collapse;
align:center;
}

tr{
height:40px;
}

td{
border:2px solid red;
border-collapse:collapse;
padding:7px;
}

div{
align:right;
}
</style>
</head>
<body>

<h2> Welcome to Book Store</h2>
<h2>Books Available for ${CAT}</h2>
<div>
<form action="showMycart.jlc">
<input type="submit" value="Show My Cart"/>
</form>
</div>
<table> 
<%
Object obj=session.getAttribute("BooksList");
if(obj!=null){
	List<String>bookList=(List<String>)obj;
	int count=1;
	for(String bname:bookList){
		
		%>
		<tr>
		<td><%= count++ %></td>
		<td><%= bname %></td>
		<td>Rs.300</td>
		<td>10% off</td>
		
		<td>
		<form action="addToCart.jlc">
		<input type="hidden" name="bname" value="<%= bname %>"/>
		<input type="submit" value="Add To Cart"/>
		</form>
		</td>
		
		</tr>
		<%
	}
}
%>

</table>
</body>
</html>