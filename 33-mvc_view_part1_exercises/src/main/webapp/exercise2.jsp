<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Exercise 2 - Fibonacci 25</title>
<style>
li {
	list-style-type: none;
}
</style>
</head>
<body>
	<h1>Exercise 2 - Fibonacci 25</h1>
	<ul>
		<c:set var="first" value="1" />
		<c:set var="second" value="2" />

		<c:forEach begin="1" end="25" step="1">
		
			<li>${first}</li>
			
			<c:set var="fibonacciSum" value="${first + second}" />
			<c:set var="first" value="${second}" />
			<c:set var="second" value="${fibonacciSum}" />
		</c:forEach>

		<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>


	</ul>
</body>
</html>