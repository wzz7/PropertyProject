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
  <meta charset="utf-8">
  <title>Layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="./js/css/layui.css" tppabs="https://www.layui.site/layui/dist/css/layui.css"  media="all">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
  <style>
    .layui-input{
      width: 300px;
    }
    .layui-form{

    }
  </style>
</head>
  <body>
  <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>登录</legend>
  </fieldset>

  <form class="layui-form" action="http://localhost:8080/login" lay-filter="example">
    <div class="layui-form-item">
      <label class="layui-form-label" >输入框</label>
      <div class="layui-input-block">
        <input type="text" name="username" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">密码框</label>
      <div class="layui-input-block">
        <input type="password" name="password" placeholder="请输入密码" autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <div class="layui-input-block">
        <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">登录</button>
        <a href="" value="注册">注册</a>
      </div>
    </div>
  </form>
  </body>
</html>
