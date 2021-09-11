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
<form action="updatebookweb">
    <div class="row">
    
        <div class="col-md-3 border-right">
            <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class=" mt-5" src="/${booklist.get().image}" width="200px"><span class="font-weight-bold">${booklist.get().book_name}</span><span class="text-black-50"></span><span> </span></div>
        </div>
        <div class="col-md-5 border-right">
            <div class="p-3 py-5">
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h4 class="text-right">Book Post Details</h4>
                </div>
             
                <div class="row mt-2">
                    <div class="col-md-6"><label class="labels">ID</label><input name="listing_book_id" type="text" class="form-control" placeholder="ID" value="${booklist.get().listing_book_id}"></div>
                    <div class="col-md-6"><label class="labels">Book Name</label><input name="book_name" type="text" class="form-control" value="${booklist.get().book_name}" placeholder="Enter Book Name"></div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-12"><label class="labels">Author</label><input name="author" type="text" class="form-control" placeholder="Enter name of Author" value="${booklist.get().author}"></div>
                    <div class="col-md-12"><label class="labels">ISBN</label><input name="isbn" type="text" class="form-control" placeholder="Enter ISBN" value="${booklist.get().isbn}"></div>
                    <div class="col-md-12"><label class="labels">Quantity</label><input name="quantity" type="text" class="form-control" placeholder="Enter Quantity" value="${booklist.get().quantity}"></div>
                    <div class="col-md-12"><label class="labels">Listing Type</label><input name="listing_type" type="text" class="form-control" placeholder="EnterListing Type" value="${booklist.get().listing_type}"></div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-6"><label class="labels">Ebook</label><input name="e_book_file" type="text" class="form-control" placeholder="Ebook or Not a Ebook" value="${booklist.get().e_book_file}"></div>
                    <div class="col-md-6"><label class="labels">Price</label><input name="price" type="text" class="form-control" value="${booklist.get().price}" placeholder="Enter Price"></div>
                </div>
           
                <div class="mt-5 text-center"><input type="submit" value="Save Book Details" class="btn btn-primary profile-button" ></div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="p-3 py-5">
                <div class="col-md-12"><label class="labels">Publish Year</label><input name="published_year" type="text" class="form-control" placeholder="EnterYear" value="${booklist.get().published_year}"></div>
                <div class="col-md-12"><label class="labels">Category</label><input name="categoryid" type="text" class="form-control" placeholder="EnterCategory" value="${booklist.get().categoryid}"></div>  <br>
                <div class="col-md-12"><label class="labels">District</label><input name="district" type="text" class="form-control" placeholder="Enter District" value="${booklist.get().district}"></div>
                <div class="col-md-12"><label class="labels">City</label><input name="city" type="text" class="form-control" placeholder="Enter City" value="${booklist.get().city}"></div>
                 <div class="col-md-12"><label class="labels">Phone No</label><input name="tp" type="text" class="form-control" placeholder="Enter Phone No" value="${booklist.get().tp}"></div>
                 <div class="col-md-12"><label class="labels">image</label><input name="image" type="hidden" class="form-control" placeholder="Enter Phone No" value="${booklist.get().image}"></div>
            </div>
        </div>
    </div>
       </form>
    
</div>

</body>
</html>