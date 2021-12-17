<%--
  Created by IntelliJ IDEA.
  User: wz7
  Date: 2021/12/16
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>

</head>
<body>
<h1 style="text-align: center">Welcome</h1>
<form class="form-horizontal" action="http://localhost:8080/login" method="post">
    <div class="form-group">
        <label for="inputEmail3" class="col-sm-2 control-label">Username</label>
        <div class="col-xs-4">
            <input type="text" class="form-control" id="inputEmail3" name="username" placeholder="请输入用户名">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
        <div class="col-xs-4">
            <input type="password" class="form-control" id="inputPassword3" name="password" placeholder="请输入密码">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPassword3" class="col-sm-2 control-label">验证码</label>
        <div class="col-xs-2">
            <input type="text" class="form-control" name="code"> <img src="http://localhost:8080/kaptcha.jpg" id="codeImg" ><br>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <div class="checkbox">
                <label>
                    <input type="checkbox"> Remember me
                </label>
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default" >Sign in</button>
        </div>
        <div class="col-sm-offset-2 col-sm-10">
            <a href="http://localhost:8080/regist.jsp" >Regist</a>
        </div>
    </div>
</form>

<script>
    $(function (){
        $("#codeImg").click(function (){
            /*双引号！！！！！！！！！！！！！！！！！！！！！！！！！！！！*/
            /*每次拼一个时间 ，防止浏览器缓存*/
            this.src = "<%request.getContextPath();%>kaptcha.jpg?"+new Date();
        })
    })
</script>
</body>
</html>
