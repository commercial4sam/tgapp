<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<Html>
<head>
<title>Registration Page</title>
</head>

<body bgcolor="Lightskyblue">
	<br>
	<br>
	<form:form method="post" action="/adduser" modelAttribute="registration">

		<table>
			<tr>
				<td><form:label path="firstName"> First Name </form:label></td>
				<td><form:input path="firstName" type="text" name="firstName" size="15" /> 
				</td>
			</tr>

			<tr>
				<td><form:label path="middleName"> Middle Name: </form:label></td>
				<td><form:input path="middleName" type="text" name="middleName" size="15" /> <br>
					<br></td>
			</tr>
			<tr>
				<td><form:label path="lastName"> Last Name: </form:label></td>
				<td><form:input path="lastName" type="text" name="lastName" size="15" /> <br>
					<br></td>
			</tr>

			<tr>
				<td><form:label path="gender">   Gender :  </form:label></td>
				<td>	<form:checkbox path="gender" value="Male"/> Male
						<form:checkbox path="gender" value="Female"/> Female
						<form:checkbox path="gender" value="Other"/> Other
				</td>
			</tr>
			<tr>
				<td><form:label path="phone">   Phone :  </form:label></td>
				<td><input type="text" name="country code" value="+01" size="2" />
					<form:input path="phone" type="text" name="phone" size="10" /> <br> <br>
				</td>
			</tr>
			<tr>
				<td><form:label path="email">   Email :  </form:label></td>
				<td><form:input path="email" type="email" id="email" name="email" /> <br>
				</td>
			</tr>

			<tr>
				<td><form:label path="password">   Password :  </form:label></td>
				<td><form:input path="password" type="password" id="password" name="password" />
					<br></td>
			</tr>
			<tr>
				<td><form:label path="repassword">  Confirm Password :  </form:label></td>
				<td><form:input path="repassword" type="password" id="repassword"
						name="repassword" /> <br></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>


	</form:form>
</body>
</html>