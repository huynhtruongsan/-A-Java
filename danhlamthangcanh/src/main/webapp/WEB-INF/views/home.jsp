<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>Đi chơi ngay nào</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$('#timkiem').click(function(e) {
            e.preventDefault();
            $('#portfolio').load('them.jsp');
        });
	});
</script>
</head>

<body >
	<!-- menu -->
	<!-- Navbar -->
	<div class="w3-top">
	 <div class="w3-bar w3-theme-d2 w3-left-align">
	  <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-hover-white w3-theme-d2" href="javascript:void(0);" onclick="openNav()"><i class="fa fa-bars"></i></a>
	  <a href="http://localhost:8080/danhlam" class="w3-bar-item w3-button w3-teal"><i class="fa fa-home w3-margin-right"></i>Trang chủ</a>
	  <a href="http://localhost:8080/danhlam/dulich" class="w3-bar-item w3-button w3-hide-small w3-hover-white">Du lịch</a>
	  <a href="http://localhost:8080/danhlam/sukien" class="w3-bar-item w3-button w3-hide-small w3-hover-white">Sự kiện</a>
	  <form:form method="GET" action="/danhlam/timkiem" >
	  <input type="submit" value="Tìm kiếm" class="w3-bar-item w3-button w3-hide-small w3-right w3-hover-teal" >
	  <form:input path="tentintuc" class="w3-bar-item  w3-hide-small w3-right w3-hover-teal" style="background-color: #555555" />
	  </form:form>
	  </div>
	 
	  <!-- Navbar on small screens -->
	  <div id="navDemo" class="w3-bar-block w3-theme-d2 w3-hide w3-hide-large w3-hide-medium">
	    <a href="http://localhost:8080/danhlam" class="w3-bar-item w3-button">Trang chủ</a>
	    <a href="http://localhost:8080/danhlam/dulich" class="w3-bar-item w3-button">Du lịch</a>
	    <a href="http://localhost:8080/danhlam/sukien" class="w3-bar-item w3-button">Sự kiện</a>
	  </div>
	</div>
	<div style="height:38px"></div>
	<!-- end menu -->

	<!-- Header -->
		<header class="w3-display-container w3-content w3-center" style="max-width:1500px">
	  <img class="w3-image" src="resources/images/photographer.jpg" alt="Me" width="1500" height="600">
	  <div class="w3-display-middle w3-padding-large w3-border w3-wide w3-text-light-grey w3-center">
	    <h1 class="w3-hide-medium w3-hide-small w3-xxxlarge">HÃY XEM</h1> 
	    <h5 class="w3-hide-large" style="white-space:nowrap">HÃY XEM</h5>
	    <h3 class="w3-hide-medium w3-hide-small">Vài cảnh đẹp trên thế giới</h3>
	    <h5 class="w3-hide-large" style="white-space:nowrap">Vài cảnh đẹp trên thế giới</h5>
	  	</div>
	  
		  <!-- Navbar (placed at the bottom of the header image) -->
		  <div class="w3-bar w3-light-grey w3-round w3-display-bottommiddle w3-hide-small" style="bottom:-16px"></div>
		</header>
	<!-- End header -->

	<!-- Page content -->
	<div class="w3-content w3-padding-large w3-margin-top" id="portfolio">
	
	  <!-- Cảnh đẹp -->
	  <c:forEach var="tt" items="${listdulich}">
	  <a href="${pageContext.request.contextPath}/dulich/chi-tiet-tin-tuc?idtintuc=${tt.getIdtintuc()}">
	  <img src="${pageContext.request.contextPath}/admin/quan-li-tin-tuc/hien-thi-hinh-anh?id=${tt.getIdtintuc()}" alt="" class="w3-image" width="1000" height="500">
	  <h5 style=" text-align: center">${tt.getTentintuc()}</h5>
	  </a>
	  </c:forEach>
	  <!-- End cảnh đẹp  -->
	  
	  <!-- Sự kiện -->
	  <hr/>
	  <h5 style=" text-align: center;font-size: 250%;color:Orange">Sự kiển nổi bật tháng 5</h5>
	  <h5 style=" text-align:center"><i class="fa fa-angle-double-down" aria-hidden="true" ></i></h5>
	  <p style="text-align: center;"><i class="arrow down"></i></p>	
	  <c:forEach var="tt" items="${listsukien }" >
	  <a href="${pageContext.request.contextPath}/dulich/chi-tiet-tin-tuc?idtintuc=${tt.getIdtintuc()}">
	  <img src="${pageContext.request.contextPath}/admin/quan-li-tin-tuc/hien-thi-hinh-anh?id=${tt.getIdtintuc()}" alt="Ocean" class="w3-image" width="1000" height="500">
	  <h5 style=" text-align: center">${tt.getTentintuc() }</h5>
	  </a>
	  </c:forEach>
	  <!--End Sự kiện -->
	  </div>
<!-- End page content -->

<div style="clear:both"></div>
<!-- FOOTER -->
<footer class="w3-container w3-padding-32 w3-theme-d1 w3-center">
  <h4>Theo dõi chúng tôi tại:</h4>
  <a class="w3-button w3-large w3-teal" href="javascript:void(0)" title="Facebook"><i class="fa fa-facebook"></i></a>
  <a class="w3-button w3-large w3-teal" href="javascript:void(0)" title="Twitter"><i class="fa fa-twitter"></i></a>
  <a class="w3-button w3-large w3-teal" href="javascript:void(0)" title="Google +"><i class="fa fa-google-plus"></i></a>
  <a class="w3-button w3-large w3-teal" href="javascript:void(0)" title="Google +"><i class="fa fa-instagram"></i></a>
  <a class="w3-button w3-large w3-teal w3-hide-small" href="javascript:void(0)" title="Linkedin"><i class="fa fa-linkedin"></i></a>
  <p>© 2017 by Trường San</p>

  <div style="position:relative;bottom:100px;z-index:1;" class="w3-tooltip w3-right">
    <span class="w3-text w3-padding w3-teal w3-hide-small">Go To Top</span>   
    <a class="w3-button w3-theme" href="#myPage"><span class="w3-xlarge">
    <i class="fa fa-chevron-circle-up"></i></span></a>
  </div>
</footer>
<!-- END FOOTER -->


<script>
// Script for side navigation
function w3_open() {
    var x = document.getElementById("mySidebar");
    x.style.width = "300px";
    x.style.paddingTop = "10%";
    x.style.display = "block";
}

// Close side navigation
function w3_close() {
    document.getElementById("mySidebar").style.display = "none";
}

// Used to toggle the menu on smaller screens when clicking on the menu button
function openNav() {
    var x = document.getElementById("navDemo");
    if (x.className.indexOf("w3-show") == -1) {
        x.className += " w3-show";
    } else { 
        x.className = x.className.replace(" w3-show", "");
    }
}
</script>

</body>
</html>

