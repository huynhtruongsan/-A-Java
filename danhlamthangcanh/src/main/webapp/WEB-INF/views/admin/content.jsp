<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
        <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="page-wrapper">
            <div class="main-page">
                <div class="row-one">	
                    <div class="col-md-4 widget">
                        <div class="stats-left ">
                            <h5>Số lượng</h5>
                            <h4>Thành viên</h4>
                        </div>
                        <div class="stats-right">
                            <label>${allUser}5</label>
                        </div>
                        <div class="clearfix"> </div>	
                    </div>
                    <div class="col-md-4 widget states-mdl">
                        <div class="stats-left">
                            <h5>Bài viết</h5>
                            <h4>Du lịch</h4>
                        </div>
                        <div class="stats-right">
                            <label>${allLichTrinh}6</label>
                        </div>
                        <div class="clearfix"> </div>	
                    </div>
                    <div class="col-md-4 widget states-last">
                        <div class="stats-left">
                            <h5>Bài viết</h5>
                            <h4>Sự kiện</h4>
                        </div>
                        <div class="stats-right">
                            <label>${tonglichtrinh}7</label>
                        </div>
                        <div class="clearfix"> </div>	
                    </div>
                    <div class="clearfix"> </div>	
                </div>
                
                
                <div hidden="" class="row calender widget-shadow">
                    <h4 class="title">Calender</h4>
                    <div class="cal1">

                    </div>
                </div>
                <div class="clearfix"> </div>
            </div>
        </div>
    </body>
</html>
