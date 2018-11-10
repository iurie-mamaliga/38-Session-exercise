<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="favorite things" />
</c:import>
<section>
	<div class="boxed">
		<h2>Favorite Things Exercise</h2>
		<div id="question">
			<h3>What is your favorite color?</h3>
			
	<form method =  "POST" action= "page1">
	 <input autofocus type="text" name="favoriteColor" value= "${favoriteColor}" id="color" class="input-field" required><br>
	 <br>
	 <button id="submit" type="submit">Next>>></button>
	
	</form>
		</div>
	</div>

</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp"/>