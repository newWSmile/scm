<%--
  Created by IntelliJ IDEA.
  User: 军街
  Date: 2016/10/18
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    <%@ include file="/common/common.jspf"%>
    <title>My JSP</title>
</head>
<body>

<form id="ff" method="post">
    <div>
        供应商编号: <input type="text" name="supId" />
    </div>
    <div>
        供应商: <input type="text" name="supName" />
    </div>
    <div>
        联系人: <input type="text"  name="supLinkman" />
    </div>
    <div>
        联系电话: <input type="text" name="supPhone" />
    </div>
    <div>
        联系地址: <input type="text" name="supAddress" />
    </div>
    <div>
        期初应付(元): <input type="text" name="supPay" />
    </div>
    <div>
        供应商类型：
        <select id="cc" class="easyui-combobox" name="supType" style="width:200px;">
            <c:forEach items="${applicationScope.sysParam.supType}" var="supType">
                <option value="${supType.key}">${supType.value}</option>
            </c:forEach>
        </select>
    </div>
    <div>
        备注:
        <textarea name="supRemark"></textarea>
    </div>
    <div>
        <input id="btn" type="button" value="提交" />
    </div>
</form>

<script type="text/javascript">
    $(function() {
        var win = parent.$("iframe[title='供应商管理']").get(0).contentWindow;//返回ifram页面文档（window)

        $("[name='supName']").validatebox({
            required : true,
            missingMessage : '请填写供应商！'
        });
        $("[name='supLinkman']").validatebox({
            required : true,
            missingMessage : '请填写出联系人！'
        });
        $("[name='supPhone']").validatebox({
            required : true,
            missingMessage : '请填写联系电话！'
        });
        //禁用验证
        $("#ff").form("disableValidation");

        $("#btn").click(function() {
            //alert("ddddddddddd");
            $("#ff").form("enableValidation");
            if ($("#ff").form("validate")) {
                alert("------------");
                $('#ff').form('submit', {
                    url : '${proPath}/supplier/insert.action',
                    onSubmit : function() {
                        return true;
                    },
                    success : function(count) {
                        //可以定义为对应消息框
                        alert("成功");
                        parent.$("#win").window("close");
                        win.$("#dg").datagrid("reload");
                    }
                });

            }

        });

    });
</script>
</body>
</html>
