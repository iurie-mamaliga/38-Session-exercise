<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib  uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>


<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name= "pageTitle" value= "product table View"/>
</c:import>

 <section id="main-content">
		<p class= "heading">
			Toy Department</p>
   	<table id="productTable">
			
				<tr>
					<th></th>
						<c:forEach var="product" items="${requestScope.productList}">
							<c:url var="productLink" value="productDetail?productId=${product.productId}"/>
								<td><a href="${productLink}"><img src="img/${product.imageName}" class="productImage"></a></td>
						</c:forEach>
				</tr>
				<tr class="gray">
					<th>Name</th>
						<c:forEach var="product" items="${requestScope.productList}">
							<td class="link"><a href="${productLink}"><c:out value="${product.name}" /></a></td>
						</c:forEach>
				</tr>
				<tr>
					<th>Rating</th>
						<c:forEach var="product" items="${requestScope.productList}">
					<td ><fmt:formatNumber value="${product.averageRating}" maxFractionDigits="0" var="formattedRating"/>
						<img src="img/${formattedRating}-star.png" class="rating"/>
					</td>
				</c:forEach>
				</tr>
				<tr>	
				<tr class="gray">
					<th>Mfr</th>
						<c:forEach var="product" items="${requestScope.productList}">
							<td><c:out value="${product.manufacturer}" /></td>
						</c:forEach>
				</tr>
				<tr>	
					<th>Price</th>
						<c:forEach var="product" items="${requestScope.productList}">
							<td class="price" ><c:out value="${product.price}" /></td>
						</c:forEach>
				</tr>
				<tr>
				<tr class="gray">
					<th>wt.(in lbs)</th>
						<c:forEach var="product" items="${requestScope.productList}">
							<td><c:out value="${product.weightInLbs}" /></td>
						</c:forEach>
				</tr>			
			</table>
   </section>
<c:import url="/WEB-INF/jsp/common/footer.jsp"/>