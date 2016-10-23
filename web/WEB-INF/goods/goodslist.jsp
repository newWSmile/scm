<%--
  Created by IntelliJ IDEA.
  User: 军街
  Date: 2016/10/14
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    <%@ include file="/common/common.jspf"%>
    <title>My Supplier JSP</title>
</head>
<script type="text/javascript">
    $(function () {
        $('#dg').datagrid({
            url : '${proPath}/datagrid_data1.json',
            columns:[ [ {
                field : 'productid',
                title : '产品编号',
                width : '100'
            }, {
                field : 'productname',
                title : '产品名称',
                width : '100'
            }, {
                field : 'listprice',
                title : '产品价格',
                width : 100,
                align : 'right'
            } ] ]

        })
    });
</script>
<body>
   <table id="dg"></table>
</body>
</html>
