<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Một vài nơi đẹp</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">	
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet" type="text/css">	
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", sans-serif}
.w3-row img {margin-bottom: -8px}
.w3-quarter img{margin-bottom: -6px; cursor: pointer}
.w3-quarter img:hover{opacity: 0.6; transition: 0.3s}
</style>
</head>

<body class="w3-light-grey w3-content" style="max-width:1500px">
<!-- Menu -->
		<!-- Navbar -->
		<div class="w3-top">
		 <div class="w3-bar w3-theme-d2 w3-left-align">
		  <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-hover-white w3-theme-d2" href="javascript:void(0);" onclick="openNav()"><i class="fa fa-bars"></i></a>
		  <a href="http://localhost:8080/danhlam" class="w3-bar-item w3-button w3-teal"><i class="fa fa-home w3-margin-right"></i>Trang chủ</a>
		  <a href="http://localhost:8080/danhlam/dulich" class="w3-bar-item w3-button w3-hide-small w3-hover-white">Du lịch</a>
		  <a href="http://localhost:8080/danhlam/sukien" class="w3-bar-item w3-button w3-hide-small w3-hover-white">Sự kiện</a>
		  
		 </div>
		
		  <!-- Navbar on small screens -->
		  <div id="navDemo" class="w3-bar-block w3-theme-d2 w3-hide w3-hide-large w3-hide-medium">
		    <a href="http://localhost:8080/danhlam" class="w3-bar-item w3-button">Trang chủ</a>
		    <a href="http://localhost:8080/danhlam/dulich" class="w3-bar-item w3-button">Du lịch</a>
		    <a href="http://localhost:8080/danhlam/sukien" class="w3-bar-item w3-button">Sự kiện</a>		 
		  </div>
		</div>
		<div style="height:38px"></div>
	<!--End Menu -->
	

	  
	  <div style="height:20px;background-color:#f1f1f1"></div>

  <!-- end Header -->
      
  <!-- Nội dung hiển thị -->
  <div class="w3-row-padding" style="width:100%;align:center;margin: auto;">
  	<c:forEach var="tt" items="${listtt}">
  	<div class="w3-third w3-container w3-margin-bottom">
  	<a href="${pageContext.request.contextPath}/dulich/chi-tiet-tin-tuc?idtintuc=${tt.getIdtintuc()}">
      <img src="${pageContext.request.contextPath}/admin/quan-li-tin-tuc/hien-thi-hinh-anh?id=${tt.getIdtintuc()}" alt="" style="width:100%;height:300px" class="w3-hover-opacity">
      <div class="w3-container w3-white">
        <h3>${tt.getTentintuc()}</h3>
        <p>${tt.getNgaydang()}</p>
        <p>${tt.getMotangan()}</p>
      </div>
    </div>
    </a>
 	</c:forEach>	
  </div>   
  <!--End Nội dung hiển thị -->  

 <!-- FOOTER -->     
     <!-- Footer -->
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
// Script to open and close sidebar
function w3_open() {
    document.getElementById("mySidebar").style.display = "block";
    document.getElementById("myOverlay").style.display = "block";
}
 
function w3_close() {
    document.getElementById("mySidebar").style.display = "none";
    document.getElementById("myOverlay").style.display = "none";
}
</script>

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
