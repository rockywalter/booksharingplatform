<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
    
<!DOCTYPE html>
<html>
<%@include file="head.jsp" %>
<body id="page-top">
  <!-- Page Wrapper -->
  <div id="wrapper">
  <%@include file="sidebar.jsp" %>
  
    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">
     <!-- Main Content -->
      <div id="content">
      
      <%@include file="topbar.jsp" %>
      
       <!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Page Heading -->
          <h1 class="h3 mb-4 text-gray-800">Book Adds</h1>

 <!-- Begin Here to write-->

<p>  hello world icne ceciuhco ceocheocnle cei         </p>


<div class="container">
  <div class="row">
    <div class="col-12">
      <table class="table table-bordered">
        <thead>
        
        <tr>
 

 
 
            <th scope="col">ID</th>
            <th scope="col">Book_name</th>
            <th scope="col">Price</th>
            <th scope="col">Listing_type</th>
            <th scope="col">Quantity</th>
            <th scope="col">District</th>
            <th scope="col">Category_id</th>
            <th scope="col">User_id</th>

          </tr>
        </thead>
        <tbody>
        
        <c:forEach var="book" items="${booklist}">
         <tr>
            <th scope="row">${book.listing_book_id}</th>
            <td>${book.book_name}</td>
            <td>${book.price}</td>
            <td>${book.listing_type}</td>
            <td>${book.quantity}</td>
            <td>${book.district}</td>
            <td>${book.categoryid}</td>
            <td>${book.user_id}</td>
   
            <td>
            
      
           

              <button onclick="location.href='/updateaddbookform?id=${book.listing_book_id}'" class="btn btn-success"><i class="fas fa-edit"></i></button>

 <button onclick="location.href='/deletebookweb?id=${book.listing_book_id}'" class="btn btn-danger" type="button"><i class="far fa-trash-alt"></i> </button>


            </td>
          </tr>
     
       </c:forEach> 
        
        
        
         
        </tbody>
      </table>
    </div>
  </div>
</div>

        </div>
        <!-- /.container-fluid -->
           
      </div>
      <!-- End of Main Content -->
      
       <%@include file="footer.jsp" %>
    </div>
    <!-- End of Content Wrapper -->
  
  </div>
  <!-- End of Page Wrapper -->
  
   <%@include file="end.jsp" %>
</body>
</html>