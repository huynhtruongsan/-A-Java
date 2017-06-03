<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Sự kiện tháng này</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body id="myPage">
<!-- menu -->
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
<!-- end menu -->

<!-- Sự kiện -->
<div class="w3-row-padding w3-padding-64 w3-theme-l1" id="work">

<div class="w3-quarter" style="color:Orange">
<h2>5 địa điểm du lịch lý tưởng mùa hè 2017</h2>
<p> 
Vào mùa hè này thì còn gì bằng là tự thưởng cho bản thân một chuyến đi du lịch. 
Nhưng với đất nước Việt Nam xinh đẹp với những cảnh đẹp nên thơ thì bạn còn đang phân 
vân không biết đi đâu? Dưới đây, Trường Hồng Travel sẽ giới thiệu cho các bạn 5 địa 
điểm du lịch lý tưởng vào mùa hè này.
</p>
</div>

<c:forEach var="tt" items="${listtt}">
<div class="w3-quarter">
	  <div class="w3-card-2 w3-white">
	  <a href="${pageContext.request.contextPath}/dulich/chi-tiet-tin-tuc?idtintuc=${tt.getIdtintuc()}">
	  <img src="${pageContext.request.contextPath}/admin/quan-li-tin-tuc/hien-thi-hinh-anh?id=${tt.getIdtintuc()}" alt="" style="width:100%">
		  <div class="w3-container">
		  <h3>${tt.getTentintuc() }</h3>
		  <p>${tt.getNgaydang() }</p>
		  <p>${tt.getMotangan() }</p> 
		  </div>
	  </div>
	  </a>
	  <div style="height:30px"></div>
</div>
</c:forEach>
</div>
<!--End Sự kiện -->

<!-- Người tham dự -->
<div class="w3-container w3-padding-64 w3-center" id="team">
<h2>Người tham dự</h2>
<p>Những gương mặt hot năm nay</p>

<div class="w3-row"><br>

<div class="w3-quarter">
  <img src="resources/images/baoanh.jpg" alt="Boss" style="width:45%" class="w3-circle w3-hover-opacity">
  <h3>Bảo anh</h3>
  <p>Ca sĩ</p>
</div>

<div class="w3-quarter">
  <img src="resources/images/tl.jpg" alt="Boss" style="width:45%" class="w3-circle w3-hover-opacity">
  <h3>Taylor swift</h3>
  <p>Ca sĩ</p>
</div>

<div class="w3-quarter">
  <img src="resources/images/al.jpg" alt="Boss" style="width:45%" class="w3-circle w3-hover-opacity">
  <h3>Alan walker</h3>
  <p>EDM</p>
</div>

<div class="w3-quarter">
  <img src="resources/images/tq.jpg" alt="Boss" style="width:45%" class="w3-circle w3-hover-opacity">
  <h3>Khổng Tú Quỳnh</h3>
  <p>Ca sĩ</p>
</div>
</div>
</div>
<!-- End người tham dự -->

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

<!--End Footer -->

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
    