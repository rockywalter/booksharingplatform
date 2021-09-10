<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!DOCTYPE html>
<html>
<head>

	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

<link rel="stylesheet" type="text/css" href="updateformstyle.css">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js" rel="stylesheet" >


<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

	<title>int complain_id;
	String complain_category;
	String comment;
	int user_id;</title>
</head>
<body>
<div class="container rounded bg-white mt-5 mb-5">
  
       
            <div class="p-3 py-5">
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h4 class="text-right">Complain Details</h4>
                </div>
                <div class="row mt-2">
                    <div class="col-md-6"><label class="labels"> Complain ID</label><input type="text" class="form-control" placeholder="Complain ID" value=""></div>
                    <div class="col-md-6"><label class="labels">Complain Category</label><input type="text" class="form-control" value="" placeholder="Complain Category"></div>
                    <div class="col-md-6"><label class="labels"> Comment</label><input type="text" class="form-control" placeholder="Comment" value=""></div>
                    <div class="col-md-6"><label class="labels">User ID</label><input type="text" class="form-control" value="" placeholder="User ID"></div>
                </div>
               
                <div class="mt-5 text-center"><button class="btn btn-primary profile-button" type="button">Save Complain Details</button></div>
            </div>
    
</div>
</div>
</div>
</body>
</html>