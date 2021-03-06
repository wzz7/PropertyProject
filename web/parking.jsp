<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wz7
  Date: 2021/12/16
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>抢车位</title>
    <script src="/js/jquery-3.6.0.min.js"></script> <!-- 你必须先引入jQuery1.8或以上版本 -->
    <script src="/layui/layui.js"></script>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css">
</head>
<body>
<form class="layui-form" name="pform" action="${pageContext.request.contextPath}/findParking" method="post">
    <div class="layui-form-item">
        <label class="layui-form-label">选择小区</label>
        <div class="layui-input-block" style="width: 120px">
            <select name="community" onchange="this.form.submit();">
                <option value="0">请选择小区</option>
                <option value="1">金域华府</option>
                <option value="2">望江台</option>
                <option value="3">汤臣一品</option>
            </select>
            <button class="layui-btn" lay-submit lay-filter="formDemo">立即查询</button>
        </div>
    </div>
</form>
<table class="layui-table">
    <colgroup>
        <col width="150">
        <col width="200">
        <col>
    </colgroup>
    <thead>
    <tr>
        <th>地址</th>
        <th>车位号</th>
        <th>到期日期</th>
        <th>抢车位</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${parkings}" var="p">
        <tr>
            <td>${p.address}</td>
            <td>${p.lid}</td>
            <td>${p.end_date}</td>
            <td>
                <a href="" onclick="return confirm('确认占车位嘛')" style="color: #00FF00">抢</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
