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
    <div class="row">
        <div class="col-md-3 border-right">
            <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class=" mt-5" src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQF2psCzfbB611rnUhxgMi-lc2oB78ykqDGYb4v83xQ1pAbhPiB&usqp=CAU"><span class="font-weight-bold">Amelly</span><span class="text-black-50">amelly12@bbb.com</span><span> </span></div>
        </div>
        <div class="col-md-5 border-right">
            <div class="p-3 py-5">
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h4 class="text-right">Book Post Details</h4>
                </div>
                <div class="row mt-2">
                    <div class="col-md-6"><label class="labels">ID</label><input type="text" class="form-control" placeholder="ID" value=""></div>
                    <div class="col-md-6"><label class="labels">Book Name</label><input type="text" class="form-control" value="" placeholder="Enter Book Name"></div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-12"><label class="labels">Author</label><input type="text" class="form-control" placeholder="Enter name of Author" value=""></div>
                    <div class="col-md-12"><label class="labels">ISBN</label><input type="text" class="form-control" placeholder="Enter ISBN" value=""></div>
                    <div class="col-md-12"><label class="labels">Quantity</label><input type="text" class="form-control" placeholder="Enter Quantity" value=""></div>
                    <div class="col-md-12"><label class="labels">Listing Type</label><input type="text" class="form-control" placeholder="EnterListing Type" value=""></div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-6"><label class="labels">Ebook</label><input type="text" class="form-control" placeholder="Ebook or Not a Ebook" value=""></div>
                    <div class="col-md-6"><label class="labels">Price</label><input type="text" class="form-control" value="" placeholder="Enter Price"></div>
                </div>
                <div class="mt-5 text-center"><button class="btn btn-primary profile-button" type="button">Save Book Details</button></div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="p-3 py-5">
               
                <div class="col-md-12"><label class="labels">Category</label><input type="text" class="form-control" placeholder="EnterCategory" value=""></div> <br>
                <div class="col-md-12"><label class="labels">District</label><input type="text" class="form-control" placeholder="Enter District" value=""></div>
                <div class="col-md-12"><label class="labels">City</label><input type="text" class="form-control" placeholder="Enter City" value=""></div>
                 <div class="col-md-12"><label class="labels">Phone No</label><input type="text" class="form-control" placeholder="Enter Phone No" value=""></div>
            </div>
        </div>
    </div>
</div>
</div>
</div>
</body>
</html>