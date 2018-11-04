<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
   
    <title><c:out value= "${param.pageTitle}"/></title>
    <c:url var="sitesCssUrl" value="/css/site.css"/>
    <link rel="stylesheet" type="text/css" href="${sitesCssUrl }" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul>
            <li><a href="productList">List Layout</a></li>
            <li><a href="productTiles">Tile Layout</a></li>
             <li><a href="productTable">Table Layout</a></li>
           
            
        </ul>
        
    </nav>
  
   
 
