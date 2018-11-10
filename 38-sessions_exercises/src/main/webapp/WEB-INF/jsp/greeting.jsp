<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name= "pageTitle" value= "favorite things"/>
</c:import>
		<h1>Hello, <c:out value="${param.name}" />!</h1>
<c:import url="/WEB-INF/jsp/common/footer.jsp"/>