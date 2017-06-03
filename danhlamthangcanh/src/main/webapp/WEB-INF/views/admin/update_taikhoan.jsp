<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
        <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Novus Admin Panel Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- Bootstrap Core CSS -->

        <link href="<c:url value="/resources/admin/css/bootstrap.css" />" rel='stylesheet' type='text/css' />
        <!-- Custom CSS -->

        <link href="<c:url value="/resources/admin/css/style.css" />" rel='stylesheet' type='text/css' />
        <!-- font CSS -->
        <!-- font-awesome icons -->

        <link href="<c:url value="/resources/admin/css/font-awesome.css" />" rel="stylesheet"> 
        <!-- //font-awesome icons -->
        <!-- js-->
        <script src="<c:url value="/resources/admin/js/jquery-1.11.1.min.js" />"></script>
        <script src="<c:url value="/resources/admin/js/modernizr.custom.js" />"></script>

        <!--webfonts-->

        <link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,300,300italic,400italic,700,700italic' rel='stylesheet' type='text/css'>
        <!--//webfonts--> 
        <!--animate-->

        <link href="<c:url value="/resources/admin/css/animate.css" />" rel="stylesheet" type="text/css" media="all">
        <script src="<c:url value="/resources/admin/js/wow.min.js" />"></script>
        <script>
            new WOW().init();
        </script>
        <!--//end-animate-->
        <!-- chart -->

        <script src="<c:url value="/resources/admin/js/Chart.js" />"></script>
        <!-- //chart -->
        <!--Calender-->

        <link rel="stylesheet" href=" <c:url value="/resources/admin/css/clndr.css" />" type="text/css" />

        <script src="<c:url value="/resources/admin/js/underscore-min.js" />" type="text/javascript"></script>
        <script src= "<c:url value="/resources/admin/js/moment-2.2.1.js" />" type="text/javascript"></script>
        <script src="<c:url value="/resources/admin/js/clndr.js" />" type="text/javascript"></script>
        <script src="<c:url value="/resources/admin/js/site.js" />" type="text/javascript"></script>
        <!--End Calender-->
        <!-- Metis Menu -->

        <script src="<c:url value="/resources/admin/js/metisMenu.min.js" />"></script>
        <script src="<c:url value="/resources/admin/js/custom.js" />"></script>

        <link href=" <c:url value="/resources/admin/css/custom.css" />" rel="stylesheet">

        <script src="<c:url value="/resources/ckeditor/ckeditor.js" />"></script>

    </head>
	
	<c:if test="${sessionScope.tk != 1}">
    <c:redirect url = "/admin" />
	</c:if>

     
    <body class="cbp-spmenu-push">
        <div class="main-content">
            <!-- navigation-->
            <jsp:include page="navigation.jsp"></jsp:include>
                <!-- //header-ends -->
            <jsp:include page="header.jsp"></jsp:include>
                <div id="page-wrapper">
                    <div class="main-page">
                        <div class="forms">
                            <div class="row">
                                <h3 class="title1">Cập nhật tài khoản </h3>
                                <div class="form-three widget-shadow">
                                    <form:form class="form-horizontal"  method="post" action="${pageContext.request.contextPath}/admin/quan-li-tai-khoan/sua-tai-khoan" >
                                     <div><form:hidden path="idtaikhoan" value=""/></div>
                                     
                                    <div class="form-group">
                                        <form:label for="focusedinput" class="col-sm-2 control-label" path="hoten">Tên tài khoản</form:label>
                                        <div class="col-sm-8">
                                            <form:input path="hoten" class="form-control1" id="focusedinput" placeholder=""  maxlength="100"/>
                                        </div>
                                        <div class="col-sm-2">
                                            <p class="help-block" style="color: red">${errosai}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="checkbox">
                                            <form:label class="col-sm-2 control-label" path="quyen">Cấp quyền</form:label>
                                            <div class="col-sm-8">
                                                <td>
                                                	<form:select path="quyen" class="styledselect_form_1">
														<form:options items="${quyen}" />
													</form:select>
                                                </td>
                                            </div>
                                            <div class="col-sm-2">
                                                <p class="help-block"></p>
                                            </div>
                                        </div>
                                        <td></td>
                                    </div>
                                    <div class="form-group">
                                        <form:label for="focusedinput" class="col-sm-2 control-label" path="dienthoai">Số điện thoại</form:label>
                                        <div class="col-sm-8">
                                            <form:input path="dienthoai" class="form-control1" id="focusedinput" placeholder=""  maxlength="100"/>
                                        </div>
                                        <div class="col-sm-2">
                                            <p class="help-block" style="color: red">${errosai}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <form:label for="focusedinput" class="col-sm-2 control-label" path="email">Email đăng nhập</form:label>
                                        <div class="col-sm-8">
                                            <form:input path="email" class="form-control1" id="focusedinput" placeholder=""  maxlength="100"/>
                                        </div>
                                        <div class="col-sm-2">
                                            <p class="help-block" style="color: red">${errosai}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <form:label for="focusedinput" class="col-sm-2 control-label" path="matkhau">Mật khẩu</form:label>
                                        <div class="col-sm-8">
                                            <form:input path="matkhau" class="form-control1" id="focusedinput" placeholder=""  maxlength="100"/>
                                        </div>
                                        <div class="col-sm-2">
                                            <p class="help-block" style="color: red">${errosai}</p>
                                        </div>
                                    </div>
                                  
                                   

                                    <div class="form-group">
                                        <div class="col-sm-8">
                                            <div colspan="3" style="float: right;margin-right:-100px"><input type="submit" value="Lưu dữ liệu" ></div>
                                            <!--  
                                            <div colspan="3" style="float: right"><input  type="reset" value="Quay lại trang quản lý" ></div>
                                       		 -->
                                        </div>

                                    </div>
                                </form:form>
                            </div>
                        </div>
                    </div>
                                          <div hidden="" class="row calender widget-shadow">
                        <h4 class="title">Calender</h4>
                        <div class="cal1">

                        </div>
                    </div>
                </div>
            </div>
            <!-- footer-->
            <jsp:include page="footer.jsp"></jsp:include>

            </dv>
            <!-- Classie -->

            <script src=" <c:url value="/resources/admin/js/classie.js" />"></script>
        <script>
            var menuLeft = document.getElementById('cbp-spmenu-s1'),
                    showLeftPush = document.getElementById('showLeftPush'),
                    body = document.body;

            showLeftPush.onclick = function () {
                classie.toggle(this, 'active');
                classie.toggle(body, 'cbp-spmenu-push-toright');
                classie.toggle(menuLeft, 'cbp-spmenu-open');
                disableOther('showLeftPush');
            };


            function disableOther(button) {
                if (button !== 'showLeftPush') {
                    classie.toggle(showLeftPush, 'disabled');
                }
            }
        </script>
        <!-- Bootstrap Core JavaScript -->

        <script src="<c:url value="/resources/admin/js/bootstrap.js" />"></script>
</body>
</html>
