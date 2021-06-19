<html>

<head>
<title>First Web Application</title>
<style>
body, html {
  height: 50%;
  margin: 0;
}

.bg {
 background-image: url("https://s3.amazonaws.com/thetravelfriends.com/flight.jpg"); 
  /* Full height */
  height: 100%; 

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  background-color: #E6E6FA
}

table.center {
  margin-left: auto; 
  margin-right: auto;
  background-color: green
}
</style>

</head>

<body class="bg">
    <font color="red">${errorMessage}</font>
    <form method="post">
    <table>
    <tr align="right">
    <td align="right">
    	<p>
            <img src="https://s3.amazonaws.com/thetravelfriends.com/kvklogo.png" width="300" height="300" border="0">
        </p>
    
    </td>
    </tr>
    </table>
    <table class="center" >
    <tr><td>
        User Name :   <input type="text" name="name" />
    </td></tr>
    <tr><td>
        Password : <input type="password" name="password" /> 
    </td></tr>
	<tr><td>
        <input type="submit" />
	</td></tr>    
	<tr><td>
    <td><span class="psw">Forgot <a href="#">password?</a></span></td>
	</tr>    
	<tr><td><span class="psw">New User? <a href="/userregistration"> Register</a></span></td></tr>

    </table>
    
    </form>
    
</body>

</html>