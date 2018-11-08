<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name= "pageTitle" value= "product list View"/>
</c:import>

<section class="centered">
	
	<h2><strong>Please Fill In the Form to Leave Us A Review</strong></h2>	
	
	<c:url var="newReviewUrl" value="/newReview"/>
	<form id =  "survey-form" action= "${newReviewUrl}"method="POST" modelAttribute="review">
	
    <div class="rowTab">
      <div class="labels">
        <label for="username">UserName:</label>
      </div>
      <div class="rightTab">
    <input autofocus type="text" name="username" id="username" class="input-field" placeholder="Your username here" required> 
  </div>
    </div>
      <div class="rowTab">
    <div class="labels">
  <label for="rating">Rating: </label>
  </div> 
  <div class="rightTab">
        <select name="rating" id="rating" class="input-field">
        	<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select>
        
  </div>
    </div>
      <div class="rowTab">
    <div class="labels">
  <label for="reviewTitle">Review Title: </label>
  </div> 
  <div class="rightTab">
        <input type="text" name="reviewTitle" id="reviewTitle" class="input-field" required placeholder="Review Title" required >
  </div>
    </div>
        <div class="rowTab">
      <div class="labels">
        <label for="reviewText">Please Write Your Review Here.</label>
      </div>
      <div class="rightTab">
        <textarea id="text" class="input-field" style="height:100px;resize:vertical;" name="reviewText" placeholder="Your review comment here..." required></textarea>
      </div>
    </div>
    <button id="submit" type="submit">Submit</button>
  </form>
</section><br><br><br><br>




		
<c:import url="/WEB-INF/jsp/common/footer.jsp"/>
