<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="product tile View" />
</c:import>
<section id="main-content">
		<p class= "heading">
			Toy Department</p>
		
		<div class="flexContainer">
		
		<c:forEach var="product" items="${requestScope.productList}">
			<div class="flexContainerTile">
				<c:url var="productLink"
					value="productDetail?productId=${product.productId}" />
				<a href="${productLink}"><img src="img/${product.imageName}"
					class="productImage" /></a>
				<div class="flexContainerTextTiles">
					<div class="link">
						<a href="${productLink}"><c:out value="${product.name}" />
						<span class="red"><c:out value="${product.topSeller? ' Best Seller!':''}" /></span></a>
				</div>
				
				by
				<c:out value="${product.manufacturer}" />
				<br>
				<div class="blue">
				<c:choose>
				<c:when test="${product.remainingStock < 5}">
				Only <c:out value="${product.remainingStock}" /> left!
				</c:when>
				</c:choose>
				</div>
				<div class="price">
					$
					<c:out value="${product.price}" />
				</div>
				<div>
					Weight
					<c:out value="${product.weightInLbs}" />
					lbs
				</div>
				<fmt:formatNumber value="${product.averageRating}"
					maxFractionDigits="0" var="formattedRating" />
				<img id="star" src="img/${formattedRating}-star.png"
					class="ratingTiles" />

			</div>
		</div>

	</c:forEach>

</div>
</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />