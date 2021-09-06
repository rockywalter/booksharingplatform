<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!DOCTYPE html>
<html lang="en">
<head>
	<title>Login</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="css/login.css">

</head>
<body>
<div class="sidenav">
         <div class="login-main-text" style="margin-left: 150px">
         	<p><img width="200px" src="img/logo.png"></p>
            <h2><strong>HUWAMARUWA</strong><br> Admin Panel</h2>
            
         </div>
      </div>
      <div class="main" >
         <div class="col-md-6 col-sm-12">
            <div class="login-form">
               <form action="login" >
                  <div class="form-group">
                     <label>User Name</label>
                     <input name="username" type="text" class="form-control" placeholder="User Name">
                  </div>
                  <div class="form-group">
                     <label>Password</label>
                     <input name="password" type="password" class="form-control" placeholder="Password">
                  </div>
                  <div style="color: red;">
                  <p> ${error}</p>
                  </div>
                  <button type="submit" class="btn btn-black">Login</button>
                
               </form>
            </div>
         </div>
      </div>
</body>

</html>
    