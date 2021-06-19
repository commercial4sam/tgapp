<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<Html>
<head>
<title>Restaurants</title>


<style type="text/css">
.header {
  padding: 5px;
  text-align: center;
  background: #1abc9c;
  color: red;
  font-size: 20px;
}
.subheader {
  padding: 5px;
  text-align: center;
  background: #aabb9c;
  color: red;
  font-size: 20px;
}

</style>


</head>

<body bgcolor="Lightskyblue">
	<form:form method="post" action="/addrestaurants" modelAttribute="restaurants">

<div class="header">
  <p>Add New Restaurant</p>
</div>


<div class="subheader">
<p><a href="#UserRestaurants">User Restaurants</a> &nbsp&nbsp&nbsp
<a href="#GeneralRestaurants">General Restaurants</a> &nbsp&nbsp&nbsp
<a href="#SearchRestaurants">Search Restaurants</a></p>
</div>


		<table>
			<tr>
				<td><form:label path="restaurantName"> Restaurant Name </form:label></td>
				<td><form:input path="restaurantName" type="text" name="restaurantName" size="25" /> 
				</td>
			</tr>

			<tr>
				<td><form:label path="phoneNo"> Phone No: </form:label></td>
				<td><form:input path="phoneNo" type="text" name="phoneNo" size="10" /> <br>
					<br></td>
			</tr>
			<tr>
				<td><form:label path="city"> City: </form:label></td>
				<td><form:input path="city" type="text" name="city" size="25" /> <br>
					<br></td>
			</tr>

			<tr>
				<td><form:label path="fullMenu">   Full Menu :  </form:label></td>
				<td><form:input path="fullMenu" type="text" name="fullMenu" /> <br>
				</td>
			</tr>

			<tr>
				<td><form:label path="restaurantSpecial">   Restaurant Special :  </form:label></td>
				<td><form:input path="restaurantSpecial" type="text" name="restaurantSpecial" />
					<br></td>
			</tr>
			<tr>
				<td><form:label path="comments">  Comments :  </form:label></td>
				<td><form:input path="comments" type="textarea" name="comments" /> <br></td>
			</tr>
			<tr>
				<td><form:label path="user">  Thanks To(your name) :  </form:label></td>
				<td><form:input path="user" type="textarea" name="user" /> <br></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

	<table>
		<tr>
			<th>Restaurant Name</th>
			<th>Address</th>
			<th>Website</th>
		</tr>
		<c:forEach items="${restaurantsList}" var="restaurants">
			<tr>
                        <td>${restaurants.restaurantName}</td>
                        <td>${restaurants.address}</td>
                        <td>${restaurants.website}</td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>