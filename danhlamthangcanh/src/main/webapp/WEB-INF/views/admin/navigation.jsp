<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
    </head>
    <body>
        <!--       	left-fixed -navigation
        -->        <div class=" sidebar" role="navigation">
            <div class="navbar-collapse">
                <nav class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left" id="cbp-spmenu-s1">
                    <ul class="nav" id="side-menu" >
                        <li>
                        <a href="${pageContext.request.contextPath}" style="color:white"><i class="fa fa-file-text-o nav_icon"></i>Trang chủ tin tức</a>
                        </li>
                        
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/quan-li-tin-tuc" style="color:white"><i class="fa fa-file-text-o nav_icon"></i>Quản lý tin tức</a>
                        </li>
                        
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/quan-li-tai-khoan" style="color:white"><i class="fa fa-file-text-o nav_icon"></i>Quản lý tài khoản</a>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>



    </body>
</html>
