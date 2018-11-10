<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name= "pageTitle" value= "favorite things"/>
</c:import>
<section>
	<h2 id ="result">Here is the list of your favorites.</h2>
	
	<table id= "table">
	<tr>
		<th>Favorite color ==></th>
		<td><c:out value="${yourFavorite.favoriteColor}" /></td>
	</tr>
	<tr>
		<th>Favorite food ==></th>
		<td><c:out value="${yourFavorite.favoriteFood}" /></td>
	</tr>
	<tr>
		<th>Favorite season ==></th>
		<td><c:out value="${yourFavorite.favoriteSeason}" /></td>
	</tr>
	
</table>

 <h1 id= "result">Please Click <a href= page1>Here </a>to Start Over</h1></h1>


</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp"/>