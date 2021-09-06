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
          <h1 class="h3 mb-4 text-gray-800">Hello Page</h1>

 <!-- Begin Here to write-->
<form action="addgrade">
  <div class="form-row align-items-center">
    <div class="col-sm-3 my-1">
      <label class="sr-only" for="inlineFormInputName">Name</label>
      <input type="text" name="grade_name" class="form-control" id="inlineFormInputName" placeholder="Input Grade">
    </div>
    
    <div class="col-auto my-1">
      <button type="submit" class="btn btn-primary">ADD</button>
    </div>
  </div>
</form>
<br>
<br>
<br>

<div class="container">
  <div class="row">
    <div class="col-12">
      <table class="table table-bordered">
        <thead>
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Grade</th>
            <th scope="col">Actions</th>
          </tr>
        </thead>
        <tbody>
        
        <c:forEach var="grade" items="${gradelist}">
         <tr>
            <th scope="row">${grade.id}</th>
            <td>${grade.grade_name}</td>
       
            <td>
          
         <!-- Button trigger modal -->



      <button onclick="location.href='/updategrade?id=${grade.id}'" formaction="/login" class="btn btn-success"><i class="fas fa-edit"></i></button>
            <button onclick="location.href='/deletegrade?id=${grade.id}'" class="btn btn-danger" type="button"><i class="far fa-trash-alt"></i> </button>
       
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