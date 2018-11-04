<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib  uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>


<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name= "pageTitle" value= "product list View"/>
</c:import>
 <section id="main-content"> 
 
		<div class="productDetailsMain" style= "padding-top: 80px;">

		<div class="containerDetailsPics">
			<img src="img/${product.imageName}"
				class="productImageList" />
		</div>

		<div class="textDetails">
			<c:out value="${product.name}" /> <span class="red"><c:out
						value="${product.topSeller? ' Best Seller!':''}" /></span><br>

			by <c:out value="${product.manufacturer}" />
			<br>

			<fmt:formatNumber value="${product.averageRating}"
				maxFractionDigits="0" var="formattedRating" />
			<img id="star" src="img/${formattedRating}-star.png"
				class="ratingTilesList" /><br> <span class="price"> $ <c:out
					value="${product.price}" />
			</span><br> Weight
			<c:out value="${product.weightInLbs}" />
			lbs <br>

			<c:out value="${product.description}"></c:out>

		</div>

	</div>

	</section>
	
<c:import url="/WEB-INF/jsp/common/footer.jsp"/>