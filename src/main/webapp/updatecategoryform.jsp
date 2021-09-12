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
  
       
       <form action="updatecatweb">
            <div class="p-3 py-5">
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h4 class="text-right">Category Details</h4>
                </div>
                <div class="row mt-2">
                    <div class="col-md-6"><label class="labels"> ID</label><input name="categoryID" type="text" class="form-control" placeholder="Category ID" value="${categorylist.get().categoryID}"></div>
                    <div class="col-md-6"><label class="labels">Name</label><input name="categoryName" type="text" class="form-control" value="${categorylist.get().categoryName}" placeholder="Category Name"></div>
                </div>
               
                <div class="mt-5 text-center"><input type="submit" vlaue="Save Category Details" class="btn btn-primary profile-button" ></div>
            </div>
    </form>
</div>
</div>
</div>
</body>
</html>