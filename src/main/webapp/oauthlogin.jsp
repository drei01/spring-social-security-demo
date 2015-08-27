 <html>
 <head>
 </head>
 <body>


<%@ taglib prefix="authz" uri="http://www.springframework.org/security/tags" %>

 <authz:authorize access="!hasRole('ROLE_USER')">


<p>Please log in with a third party provider</p>

<form class="login"action="http://localhost:8080/signin/twitter" method="POST">
	<p><input type="submit" value="Login with Twitter" /></p>
</form> 

  <form class="login"action="http://localhost:8080/signin/facebook" method="POST">
	<p><input type="submit" value="Login with Facebook" /></p>
</form>

 <form class="login"action="http://localhost:8080/signin/google" method="POST">
 	<input type="hidden" name="scope" value="https://www.googleapis.com/auth/userinfo.email https://www.googleapis.com/auth/userinfo.profile"/>
	<p><input type="submit" value="Login with Google" /></p>
</form> 

</authz:authorize>

 <authz:authorize access="hasRole('ROLE_USER')">
	
	You are already logged in
 
 </authz:authorize>
 </body>
 </html>