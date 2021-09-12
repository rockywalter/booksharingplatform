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
          <h1 class="h3 mb-4 text-gray-800">COMPLAINS</h1>
          

 <!-- Begin Here to write-->




<div class="container">
  <div class="row">
    <div class="col-12">
      <table class="table table-bordered">
        <thead>
        
     <tr>
      
            <th scope="col">Complain ID</th>
            <th scope="col">Complain Category</th>
            <th scope="col">Comment</th>
            <th scope="col">User ID</th>
            <th scope="col">Action</th>
          </tr>
        </thead>
        <tbody>
        
        <c:forEach var="complain" items="${complainlist}">
         <tr>
            <th scope="row">${complain.complain_id}</th>
            <td>${complain.complain_category}</td>
            <td>${complain.comment}</td>
            <td>${complain.user_id}</td> 
            <td>
           
            <button onclick="location.href='/deleteuserweb?id=${complain.user_id}'" formaction="/login" class="btn btn-danger"><i class="fas fa-ban"></i></button>
              <button onclick="location.href='/updatecomplainform?id=${complain.complain_id}'" formaction="/login" class="btn btn-success"><i class="fas fa-edit"></i></button>
   
            <button onclick="location.href='/deletecomplain?id=${complain.complain_id}'" class="btn btn-danger" type="button"><i class="far fa-trash-alt"></i> </button>
       
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