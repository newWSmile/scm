<%--
  Created by IntelliJ IDEA.
  User: 军街
  Date: 2016/10/13
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/common/common.jspf" %>
<html>
<head>
    <title>登录成功后</title>
    <script type="text/javascript">
        $(function() {
            $("a[title]").click(function() {
                var text = this.href;
                //alert(text);

                //alert($("#tt").tabs("exists","系统介绍"));
                if ($("#tt").tabs("exists", this.title)) {
                    //存在时选中
                    $("#tt").tabs("select", this.title);
                } else {
                    //不存在时创建
                    $("#tt").tabs("add", {
                        title : this.title,
                        closable : true,
                        //href可以加载内容填充到选项卡，但局限于body内容,但有时候页面有Js时，处理不了
                        //href : text
                        //可以加载内容填充到选项卡，页面有Js时，也可加载
                        content:"<iframe src='"+text+"' height='100%' width='100%' frameborder='0px' ></iframe>"
                    });
                }
                return false; //重点,防止打开新的页面
            });
        });
    </script>
</head>
<body class="easyui-layout">
    <%--头部--%>
    <div data-options="region:'north',title:'欢迎使用进销存管理系统',split:true"
    style="height:130px;">
        欢迎你,${sessionScope.account.accLogin}
    </div>

    <!-- 左边导航 -->
    <div data-options="region:'west',title:'导航菜单',split:true"
         style="width:150px;">
        <div id="aa" class="easyui-accordion" data-options="fit:true">
            <div title="基础数据录入">
                <ul style="list-style: none;padding: 0px;margin:0px;">
                    <!--href="${proPath}/base/goURL/supplier/supplierlist.action" 也是传给方法的参数，详见BaseAction的定义 -->
                    <li style="padding: 6px;"><a
                            href="${proPath}/base/goURL/supplier/supplierlist.action" title="供应商管理"
                            style="text-decoration: none;display: block;font-weight:bold;">供应商管理</a>
                    </li>
                    <li style="padding: 6px;"><a href="${proPath}/base/goURL/goods/goodslist.action" title="商品管理"
                                                 style="text-decoration: none;display: block;font-weight:bold;">商品管理</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <!-- 主体内容 -->
    <div data-options="region:'center',title:'主要信息'"
         style="padding:5px;background:#eec47c;">
        <div id="tt" class="easyui-tabs" data-options="fit:true" style="width:500px;height:250px;">
            <div title="系统介绍" style="padding:20px;">这里可以写系统或公司的相关介绍等等</div>
        </div>
    </div>
    <div id="win"></div>
</body>
</html>
