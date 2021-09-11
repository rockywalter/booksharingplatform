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
          <h1 class="h3 mb-4 text-gray-800">USERS</h1>

 <!-- Begin Here to write-->


<div class="container">
  <div class="row">
    <div class="col-12">
      <table class="table table-bordered">
        <thead>
        
     <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Email</th>
            <th scope="col">Password</th>
            <th scope="col">TP</th>
            <th scope="col">Rate</th>
            <th scope="col">Top Rated Status</th>
             <th scope="col">Action</th>
          </tr>
        </thead>
        <tbody>
        
        <c:forEach var="user" items="${userlist}">
         <tr>
            <th scope="row">${user.user_id}</th>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.password}</td>
            <td>${user.tp}</td>
            <td>${user.user_rate}</td>
            <td>${user.topratedstatus}</td>
            <td>
           
           
            <button onclick="location.href='/toprate?id=${user.user_id}'" class="btn btn-success"><i class="fas fa-star-half-alt"></i></button>
              <button onclick="location.href='/updateuserform?id=${user.user_id}'" formaction="/login" class="btn btn-primary"><i class="fas fa-edit"></i></button>
   
            <button onclick="location.href='/deleteuserweb?id=${user.user_id}'" class="btn btn-danger" type="button"><i class="far fa-trash-alt"></i> </button>
       
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