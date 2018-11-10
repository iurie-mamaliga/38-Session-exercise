<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name= "pageTitle" value= "favorite things"/>
</c:import>
<section>
	<div class="boxed">
		<h2>Favorite Things Exercise</h2>
		<div id="question">
			<h3>What is your favorite season?</h3>
			<c:url var="summary" value="/summary"/>
	
		<form method =  "POST" action= "page3">
	<ul>
	<li class="radio"><input name="favoriteSeason" value="Spring"  type="radio"><label for= "Spring">Spring</label></li>
    <li class="radio"><input name="favoriteSeason" value="Summer"  type="radio"><label for= "Summer">Summer</label></li>
    <li class="radio"><input name="favoriteSeason" value="Fall"  type="radio"><label for= "Fall">Fall</label></li>
    <li class="radio"><input name="favoriteSeason" value="Winter"  type="radio"><label for= "Winter">winter</label></li>
    
	 </ul>
	 <br>
	 <br>
	 <button id="submit" type="submit">Next>>></button>
	
	</form>
		</div>
	</div>

</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp"/>