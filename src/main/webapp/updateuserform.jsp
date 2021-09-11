<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!DOCTYPE html>
<html>
<head>

	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

<link rel="stylesheet" type="text/css" href="updateformstyle.css">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js" rel="stylesheet" >


<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

	<title></title>
</head>
<body>
<div class="container rounded bg-white mt-5 mb-5">
  
       
            <div class="p-3 py-5">
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h4 class="text-right">User Details</h4>
                </div>
                <form action="updateuserweb">
                <div class="row mt-2">
                    <div class="col-md-6"><label class="labels"> ID</label><input name="user_id" type="text" class="form-control" placeholder="User ID" value="${userlist.get().user_id}"></div>
                    <div class="col-md-6"><label class="labels">Name</label><input name="name" type="text" class="form-control" value="${userlist.get().name}" placeholder="Enter User Name"></div>
                    <div class="col-md-6"><label class="labels">Email</label><input name="email" type="text" class="form-control" value="${userlist.get().email}" placeholder="Enter Email"></div>
                    <div class="col-md-6"><label class="labels">Password</label><input name="password" type="text" class="form-control" value="${userlist.get().password}" placeholder="Enter Password"></div>
                    <div class="col-md-6"><label class="labels">TP</label><input name="tp" type="text" class="form-control" value="${userlist.get().tp}" placeholder="Enter TP"></div>
                    <div class="col-md-6"><label class="labels">Rate</label><input name="user_rate" type="text"  class="form-control" value="${userlist.get().user_rate}" placeholder="Enter Rate"></div>           
                </div>
               
                <div class="mt-5 text-center"><input type="submit" value="Save User Detailss" class="btn btn-primary profile-button" ></div>
                
                </form>
            </div>
    
</div>
</div>
</div>
</body>
</html>