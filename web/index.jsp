<%--
  Created by IntelliJ IDEA.
  User: 军街
  Date: 2016/10/12
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>主页测试</title>
  </head>
  <body>
    <form action="dept/insert.action" method="post">
      名称：<input type="text" name="deptName"><br>
      地址：<input type="text" name="deptAddress"><br>
      <input type="submit" value="ok">
    </form>
    <hr/>
    <h2>供应商添加</h2>
    <form action="supplier/insert.action" method="post">
      名称：<input type="text" name="supName"><br>
      <input type="submit" value="ok">
    </form>

  </body>
</html>
