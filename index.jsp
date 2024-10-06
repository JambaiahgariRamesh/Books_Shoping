<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<body>
<h2> Welcome to Book Store</h2> 
<form action="searchBooks.jlc"> 
<font color="red" size="5">${MSG}</font>
<table> 
<tr> 
<td>Select Catagory</td> 
</tr>

<tr>
<td>
<select name="catagory">
<option value="">-------select Option------</option>
<option value="java">Java Programming</option>
<option value="python">Python Programming</option>
<option value="web">Web Development</option>
</select>
</td>
</tr>

 
<tr>
<td> <input type="submit" value="Show Books"/> </td> 
</tr> 
</table> 
</form> 
</body>
</html>