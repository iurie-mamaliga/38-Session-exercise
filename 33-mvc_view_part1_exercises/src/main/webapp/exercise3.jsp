<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 3 - Echo</title>
		<style>
			li {
				list-style-type: none;
				
			}
		</style>
	</head>
	<body>
		<h1>Exercise 3 - Echo</h1>
		<ul>
		<c:set var="word" value=""/>
		<c:set var= "number" value = ""/>
		
		<c:choose>
			<c:when test="${empty param.word }">
				<c:set var="word" value="Hi Tom!"/>
			</c:when>
			<c:otherwise>
				<c:set var="word" value= "${param.word}"/>
			</c:otherwise>
		</c:choose>
		
		<c:choose>
			<c:when test = "${empty param.number}">
				<c:set var="number" value = "50"/>
			</c:when>
			
			<c:otherwise>
				<c:set var="number" value = "${param.number}"/>
			</c:otherwise>
		</c:choose>
		
		<c:forEach begin= "0" end= "${number}">
			<li style="font-size: ${number}px">${word}  </li>
			<c:set var= "number" value="${number - 1 }"/>
		</c:forEach>
		
		<%--
			Given two query string parameters, "word" and "count":
			
			Add a number of list items equal to "count".  Each list item should contain the value passed in "word".
			
			The font size of the first list item should be equal to "count".  The font size of each subsequent list
			item should be decreased by 1.
			 
			See exercise3-echo.png for example output
		 --%>
		</ul>
		
	</body>
</html>