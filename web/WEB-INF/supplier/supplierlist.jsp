<%--
  Created by IntelliJ IDEA.
  User: 军街
  Date: 2016/10/14
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/common/common.jspf"%>
<html>
<head>
    <title></title>
    <style type="text/css">
        <%--设置搜索框的style--%>
        .searchbox{
            margin: -3px;
        }
    </style>

    <script type="text/javascript">
        $(function(){

            $('#dg').datagrid({
                //支持多条件查询
                url:'${proPath}/supplier/selectPageUseDyc.action',

                fitColumns:true,
                nowrapL:true,
                idField:'supId',
                rownumbers:true,
                pagination:true,
                pageSize:5,
                pageList:[2,5,10,20],

                queryParams: {
                    supName:'%%',
                    supAddress:'%%'
                },

                toolbar: [{
                    iconCls: 'icon-add',
                    text:'新增',
                    handler: function(){
                        alert('添加按钮');
                        parent.$('#win').window({
                            width:600,
                            height:400,
                            modal:true,
                            content:"<iframe src='${proPath}/base/goURL/supplier/insert.action' height='100%' width='100%' frameborder='0px' ></iframe>"
                        });
                    }
                },'-',{
                    iconCls: 'icon-edit',
                    text:'修改',
                    handler: function(){
                        alert('修改按钮');
                    }
                },'-',{
                    iconCls: 'icon-remove',
                    text:'删除',
                    handler: function(){
                        alert('删除按钮');
                        var array =$('#dg').datagrid("getSelections");
                        if(array.length>0){
                            alert("选中了...");
                            var ids = new Array();
                            for( var x=0;x<array.length;x++){
                                ids[x] = array[x].supId;
                            }
                            alert("ids:"+ids);

//                            确认删除
                            //parent锁的是整个页面 否则就是锁的单独一个界面
                            parent.$.messager.confirm('删除对话框','你确认要删除吗?',function (r) {
                                if (r){
                                    alert(r);
                                    $.ajax({
                                        url:"${proPath}/supplier/deleteList.action",
                                        type:"POST",
                                        //设置为传统方式传送参数
                                        traditional:true,
                                        data:{pks:ids},
                                        success:function (html) {
                                            if(html>0){
                                                alert("恭喜，删除成功");
                                            }else {
                                                alert("很遗憾，删除失败");
                                            }
                                            //重新刷新网页
                                            $('#dg').datagrid('reload');
                                            //清除所有选中的行
                                            $('dg').datagrid('clearSelections');
                                        },
                                        error: function (XMLHttpRequest,textStatus,errorThrown) {
                                            $.messager.alert('删除错误','请联系管理员','error');

                                        },
                                        dataType:'json'
                                    });
                                }
                            });

                        }else{
                            alert("请选择需要删除的记录!");
                        }

                    }
                },'-',{
                    text:"名称：<input type='text' id='supName' name='supName'/>",
                }
                ,'-',{
                    text:"地址：<input type='text' id='supAddress' name='supAddress'/>",
                }],

                columns : [ [{
                    checkbox:true,
                }, {
                    field : 'supId',
                    title : '供应商编号',
                    width : 100
                }, {
                    field : 'supName',
                    title : '供应商名称',
                    width : 100
                }, {
                    field : 'supAddress',
                    title : '地址',
                    width : 100,
                    align : 'right'
                },{
                    field : 'supPhone',
                    title : '联系电话',
                    width : 100
                },{
                    field : 'supPay',
                    title : '期初应付（元）',
                    width : 100
                },{
                    field : 'supType',
                    title : '供应商类型',
                    width : 100
                },{
                    field : 'supRemark',
                    title : '备注',
                    width : 100,
                    align: 'right'
                }
                ] ]
            });

            $('#supAddress').searchbox({
                searcher:function(value,name){
                    //alert("supAddress:"+value);
                    //alert("supName:"+$('#supName').val());
                    $('#dg').datagrid('load',{
                        supName: '%'+$('#supName').val()+'%',
                        supAddress:'%'+value+'%'
                    });
                },
                prompt:''
            });

            /* 通过关键字查询
             $('#ss').searchbox({
             searcher:function(value,name){
             alert(value + "," + name);
             $('#dg').datagrid('load',{
             keyWord: '%'+value+'%'
             });
             },
             prompt:'请输入供应商名称'
             }); */

        });
    </script>
</head>

<body>
    <table id="dg"></table>
</body>
</html>