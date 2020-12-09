<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/3
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>网盘主页面</title>
    <link res="stylesheet" href="/layui/css/layui.css" media="all">
    <script type="text/javascript" src="/js/jquery-3.5.1.min.js"></script>
</head>
<body>
<div class="layui-tab layui-tab-card site-demo-button" style="position: relative;">
    <ul class="layui-nav layui-nav-tree layui-nav-side">
        <li class="layui-nav-item layui-nav-itemed">
            <a href="javascript:;">默认展开</a>
            <dl class="layui-nav-child">
                <dd>
                    <a data-url="a" data-id="11" data-title="选项a" href="" class="site-demo-active" data-type="tabAdd">选项a</a>
                </dd>
                <dd>
                    <a href="#" data-url="b" data-title="选项b"  data-id="22" class="site-demo-active" data-type="tabAdd">选项b</a>
                </dd>
                <dd>
                    <a href="">跳转</a>
                </dd>
            </dl>
        </li>
        <li class="layui-nav-item">
            <a href="javascript:;">解决方案</a>
            <dl class="layui-nav-child">
                <dd>
                    <a href="">移动模块</a>
                </dd>
                <dd>
                    <a href="">后台模版</a>
                </dd>
                <dd>
                    <a href="">电商平台</a>
                </dd>
            </dl>
        </li>
        <li class="layui-nav-item">
            <a href="#" data-url="c" data-title="选项c"  data-id="33" class="site-demo-active" data-type="tabAdd">产品c</a>
        </li>
        <li class="layui-nav-item">
            <a href="">大数据</a>
        </li>
    </ul>

    <div class="layui-tab" lay-filter="demo" lay-allowclose="true" style="margin-left: 200px;">
        <ul class="layui-tab-title">
        </ul>
        <ul class="rightmenu" style="display: none;position: absolute;">
            <li data-type="closethis">关闭当前</li>
            <li data-type="closeall">关闭所有</li>
        </ul>
        <div class="layui-tab-content">
        </div>
    </div>
</div>
<%--<table class="layui-hide" id="demo" lay-filter="test"></table>--%>
<%--<script type="text/html" id="toolbarDemo">--%>
<%--    <div class="layui-btn-container">--%>
<%--        <button class="layui-btu layui-btn-sm" lay-event="getMyDate">查看个人信息</button>--%>
<%--        <button class="layui-btu layui-btn-sm" lay-event="upLoad">我要上传</button>--%>
<%--        <button class="layui-btu layui-btn-sm" lay-event="getMyDate">我要下载</button>--%>
<%--    </div>--%>
<%--</script>--%>

</body>
</html>
