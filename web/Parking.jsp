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
</head>
<body>
  <from action="http://localhost:8080/parking">
    <select name="community" id="community">
      <option value="1">金域华府</option>
      <option value="2">望江台</option>
      <option value="3">汤臣一品</option>
    </select>
  </from>
</body>
</html>
