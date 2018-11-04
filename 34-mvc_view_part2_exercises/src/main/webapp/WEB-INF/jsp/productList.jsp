<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib  uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name= "pageTitle" value= "product list View"/>
</c:import>

 <section id="main-content">
		<p class= "heading">
			Toy Department</p>
		<c:forEach var="product" items="${requestScope.productList}">
			<div class="containerList">
			<div class="containerListPics">
				<c:url var="productLink"
					value="productDetail?productId=${product.productId}" />
				<a href="${productLink}"><img src="img/${product.imageName}"
					class="productImageList" /></a>
			</div>
			<div class="containerListInfo">
				<span class="link">
					<a href="${productLink}"><c:out value="${product.name}" />
					<span class="red"><c:out value="${product.topSeller? ' Best Seller!':''}" /></span></a>
				</span><br>
				by
				<c:out value="${product.manufacturer}" />
				<br><span class= "blue">
				<c:choose>
				<c:when test="${product.remainingStock < 5}">
				Only <c:out value="${product.remainingStock}" /> left!
				</c:when>
				</c:choose>
				</span>
			
				<br> <span class="price"> $ <c:out
						value="${product.price}" />
				</span><br> Weight
				<c:out value="${product.weightInLbs}" />
				lbs <br>
				<fmt:formatNumber value="${product.averageRating}"
					maxFractionDigits="0" var="formattedRating" />
				<img id="star" src="img/${formattedRating}-star.png"
					class="ratingTilesList" />
			
			</div>
		</div>
		<hr>
	</c:forEach>

</section>		

			
<c:import url="/WEB-INF/jsp/common/footer.jsp"/>