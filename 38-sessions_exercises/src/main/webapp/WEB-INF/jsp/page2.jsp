<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name= "pageTitle" value= "favorite things"/>
</c:import>
<section>
	<div class="boxed">
		<h2>Favorite Things Exercise</h2>
		<div id="question">
			<h3>What is your favorite food?</h3>
			<!-- <c:url var="page3" value="/page3"/> -->
		<form method =  "POST" action= "page2">
	 <input autofocus type="text" name="favoriteFood" value= "${favoriteFood}" id="food" class="input-field" required><br>
	 <br>
	 <button id="submit" type="submit">Next>>></button>
	
	</form>
		</div>
	</div>

</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp"/>