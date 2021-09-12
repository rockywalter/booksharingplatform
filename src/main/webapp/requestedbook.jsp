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
          <h1 class="h3 mb-4 text-gray-800">Requested Books</h1>
          

 <!-- Begin Here to write-->




<div class="container">
  <div class="row">
    <div class="col-12">
      <table class="table table-bordered">
        <thead>
        
     <tr>
      
            <th scope="col">Requested ID</th>
            <th scope="col">Book Name</th>
            <th scope="col">ISBN</th>
            <th scope="col">Author</th>
            <th scope="col">UserID</th>
            <th scope="col">Action</th>
          </tr>
        </thead>
        <tbody>
        
        <c:forEach var="requestBook" items="${reqbooklist}">
         <tr>
            <th scope="row">${requestBook.requestedID}</th>
            <td>${requestBook.name}</td>
            <td>${requestBook.isbn}</td>
            <td>${requestBook.author}</td>
            <td>${requestBook.userID}</td>
            <td>
           
              <button onclick="location.href='/updatereqbookform?id=${requestBook.requestedID}'" formaction="/login" class="btn btn-success"><i class="fas fa-edit"></i></button>
   
            <button onclick="location.href='/deletereqbook?id=${requestBook.requestedID}'" class="btn btn-danger" type="button"><i class="far fa-trash-alt"></i> </button>
       
            </td>
          </tr>
     
        </c:forEach>
        
        
        
         
        </tbody>
      </table>
    </div>
  </div>
</div>






