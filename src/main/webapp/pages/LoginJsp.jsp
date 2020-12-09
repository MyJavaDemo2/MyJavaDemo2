<%@ page import="java.util.Date" %>
<%@ page import="java.math.BigDecimal" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  Admin: Administrator
  Date: 2020/11/8
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>登录</title>
    <script type="text/javascript" src="/js/jquery-3.5.1.min.js" charset="UTF-8"></script>
    <script type="text/javascript" src="/layui/layui.js" charset="UTF-8"></script>
    <link rel="stylesheet" href="/layui/css/layui.css" type="text/css">
    <link rel="stylesheet" href="/css/login.css" type="text/css">

</head>

<body>
<div class="wrap">
    <div class="loginForm">
        <form>
            <div class="logoHead">
                <h2 style="margin-top: 15px;margin-left: 60px">传一网盘</h2>
            </div>
            <div class="usernameWrapDiv">
                <div class="usernameLabel">
                    <label>用户名:</label>
                </div>
                <div class="usernameDiv">
                    <i class="layui-icon layui-icon-username adminIcon"></i>
                    <input id="userName" class="layui-input adminInput" type="text" name="userName" placeholder="输入用户名" >
                </div>
            </div>
            <div class="usernameWrapDiv">
                <div class="usernameLabel">
                    <label>密码:</label>
                </div>
                <div class="passwordDiv">
                    <i class="layui-icon layui-icon-password adminIcon"></i>
                    <input id="password" class="layui-input adminInput" type="password" name="password" placeholder="输入密码">
                </div>
            </div>
            <div class="usernameWrapDiv">
                <div class="usernameLabel">
                    <label>验证码:</label>
                </div>
                <div class="cardDiv">
                    <input id="loginCard" class="layui-input cardInput" type="text" name="card" placeholder="输入验证码">
                </div>
                <div class="codeDiv">
                    <input id="loginCode" class="layui-input codeInput"  type="button">
                </div>
            </div>
            <div class="usernameWrapDiv">
                <div class="submitLabel">
                    <label>没有账号？<a href="#" id="loginRegister">点击注册</a></label>
                </div>
                <div class="submitDiv">
                    <input id="loginBtn" type="button" class="submit layui-btn layui-btn-primary" value="登录"></input>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
<script type="text/javascript">
    layui.use(['layer'],function () {
        var layer = layui.layer;
    })
    $(function () {
        // 登陆事件
        $('#loginBtn').click(function () {
            login();
        });
    });
    // 登录
    function login() {
        // if (!validateCode('#loginCard','#loginCode')){
        //     //阻断提示
        // }else {
            var userName = $('#userName').val();
            var password = $('#password').val();
            $('#loginBtn').val("正在登录...");
            $.ajax({
                type:'post',
                url:"/login?methodName=login",
                dataType:'text',
                data: "userName=" + userName + "&password=" + password,
                success:function (data) {
                    if(data=="登录成功"){
                        alert(data);
                        location.href=""
                    }else{
                        alert(data);
                    }
                },
                error:function () {
                    layer.close(loginLoadIndex);
                    $('#loginBtn').val("登录");
                }
            });
        // }
    }
</script>
</html>
