<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Online Shopping Website Using Spring MVC and Hibernate">
<meta name="author" content="Shubham Pudi">
<meta name="_csrf" content="${_csrf.token}">
<meta name="_csrf_header" content="${_csrf.headerName}">
  <title>Online Shopping Cart - ${title}</title>

<script>
	window.menu = '${title}';
	
	window.contextRoot = '${contextRoot}'
	
</script>
  <!-- Bootstrap core CSS -->
  <link href="${css}/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="${css}/myapp.css" rel="stylesheet">
  

  

</head>

<body>

  <!-- Navigation -->
  <%@include file ="./SSI/nav.jsp" %>
  <!-- Page Content -->
  <!-- Home page -->
 


			<!-- Load only when user clicks about -->
			<c:if test="${userClickHome == true }">
				<%@include file="home.jsp"%>
			</c:if>
            <c:if test="${userClickAbout == true }">
				<%@include file="about.jsp"%>
			</c:if>
			<!-- Load only when user clicks contact -->
			<c:if test="${userClickContact == true }">
				<%@include file="contact.jsp"%>
			</c:if>
  <!-- Footer -->
 
<%@include file ="./SSI/footer.jsp" %>
  <!-- Bootstrap core JavaScript -->
  <script src="${js}/jquery.js"></script>
  <script src="${js}/bootstrap.bundle.min.js"></script>
  <script src="${js}/myapp.js"></script>
</body>

</html>
