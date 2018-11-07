<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>

	<c:url value="/actorList" var="formAction" />
	<form method="GET" action="${formAction}">
        <input type="text" id="name" name="name" placeholder="Search" />
        <input type="submit" value="Search" />
        <br>
</form>
<table class="table">
<tr>

<th>Name</th>
</tr>
<c:forEach items="${actors}" var="actor">

<tr>

	<h1><c:out value="${name}" /></h1>
    <!-- What do we print here for each actor? -->
    <td><c:out value="${actor.firstName}" /></td>
    <td><c:out value="${actor.lastName}" /></td>
</tr>
</c:forEach>
</table>
<%@include file="common/footer.jspf"%>