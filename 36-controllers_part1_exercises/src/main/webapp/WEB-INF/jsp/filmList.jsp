<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Films List" />

<%@include file="common/header.jspf"%>

<div>

	<c:url var="formAction" value="/filmList" />
	<form method="GET" action="${formAction}">
		<div class="labels">
			<label for="maxLength">Maximum Length: </label> <input type="text"
				name="maxLength" id="maxLength">
		</div>
		<div class="labels">
			<label for="minLength">Minimum Length: </label> <input type="text"
				name="minLength" id="minLength">
		</div>
		<div class="dropdown">
			<label for="genre">Genre</label> <select id="genre" name="genre">
				<option></option>
				<option value="Action">Action</option>
				<option value="Animation">Animation</option>
				<option value="Children">Children</option>
				<option value="Classic">Classic</option>
				<option value="Comedy">Comedy</option>
				<option value="Documentary">Documentary</option>
				<option value="Drama">Drama</option>
				<option value="Family">Family</option>
				<option value="Foreign">Foreign</option>
				<option value="Games">Games</option>
				<option value="Horror">Horror</option>
				<option value="Music">Music</option>
				<option value="New">New</option>
				<option value="Sci-Fi">Sci-Fi</option>
				<option value="Sports">Sports</option>
				<option value="Travel">Travel</option>
			</select>
		</div>

		<button id="submit" type="submit">Search</button>


	</form>

</div>

<table class="table">
	<tr>

		<th>Title</th>
		<th>Description</th>
	</tr>
	<c:forEach items="${film}" var="film">

		<tr>

			<h1>
				<c:out value="${name}" />
			</h1>
			<!-- What do we print here for each actor? -->
			<td><c:out value="${film.title}" /></td>
			<td><c:out value="${film.description}" /></td>
			<td><c:out value="${film.releaseYear}" /></td>
			<td><c:out value="${film.length}" /></td>
			<td><c:out value="${film.rating}" /></td>


		</tr>
	</c:forEach>
</table>


<%@include file="common/footer.jspf"%>