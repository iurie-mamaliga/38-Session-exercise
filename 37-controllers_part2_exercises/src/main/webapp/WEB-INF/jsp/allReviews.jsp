<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name= "pageTitle" value= "product list View"/>
</c:import>

<section class="centeredPanel">
	<img src= "img/forDummies.png"/>
	<h2><strong>Reviews for Squirrel Cigar Party For Dummies</strong></h2>
	<c:url var="newReviewUrl" value="/newReview"/>
	<span class="centered"> <a href="${newReviewUrl }">Leave a Review</a></span>
		<ul>
		<c:forEach items="${allReviews }" var="review">
			
				
				<li><c:out value="${review.title}"/> (<c:out value="${review.username}"/>)</li>
				<li><c:out value="${review.dateSubmitted}"/></li>
				
				
				<c:forEach begin="1" end="${review.rating}" step="1">
				<img src="img/star.png" />
				</c:forEach>
				
				<li><c:out value="${review.text}"/></li>
				<br>
				<hr>
		</c:forEach>
		</ul>
	
</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp"/>

