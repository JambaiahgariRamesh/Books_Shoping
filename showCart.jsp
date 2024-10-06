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

hello{
border:2px solid red;
border-radious:5px;
align:center;
font-size:20px;
}
</style>
</head>
<body>

<h2> Welcome to Book Store</h2>
<h2>Your Collection here </h2>

<table> 
<%
Object obj=session.getAttribute("Mycart");
if(obj!=null){
	List<String>cartList=(List<String>)obj;
	if(cartList.isEmpty()){
		%>
		<font color="red" size="5">No Books in your cart,Please Shop Books</font>
	<%
	}
	
	int count=1;
	for(String bname:cartList){
		
		%>
		<tr>
		<td><%= count++ %></td>
		<td><%= bname %></td>
		<td>Rs.300</td>
		<td>10% off</td>
		
		<td>
		<form action="removeFrameCart.jlc">
		<input type="hidden" name="bname" value="<%= bname %>"/>
		<input type="submit" value="Remove From Cart"/>
		</form>
		</td>
		
		</tr>
		<%
	}
}
%>

</table>
<div>
<h3 Style="font-size:20px;text-align:center;background-color:rgb"><a href="showBooks.jsp">Continue Shopping</a></h3>
<h3 Style="font-size:20px;text-align:center;background-color:rgb"><a href="placeOrder.jlc">Place Order</a></h3>
<h3 Style="font-size:20px;text-align:center;background-color:rgb"><a href="index.jsp">Search More courses</a></h3>
</div>
</body>
</html>