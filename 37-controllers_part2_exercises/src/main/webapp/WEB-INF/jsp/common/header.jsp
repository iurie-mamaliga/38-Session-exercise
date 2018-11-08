<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hello Spring MVC CIGAR PARTY</title>
		<c:url var="sitesCssUrl" value="/css/site.css"/>
    <link rel="stylesheet" type="text/css" href="${sitesCssUrl }" />
	</head>
	<body>
	<header>
		<h1 class= "banner"><a href= "allReviews"><img src= "img/banner.png"/></a></h1>
		<a href= "allReviews"><h2 style= "text-align: right; color: maroon; text-decoration: none;">REVIEW SITE</h2></a>
	</header>
	<hr>
	 <nav >
        <ul id= "heading">
            <li id= "head"><a href="allReviews">SQUIRREL DREY</a></li>
             <li id= "head"><a href="newReview">BOOK REVIEWS</a></li>
           
            
        </ul>
        
    </nav>
    <hr>
