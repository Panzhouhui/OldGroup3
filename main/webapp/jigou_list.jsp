<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<title>养老机构信息页</title>
<div>
    <form action="/jigou.html?act=get" method="post" id="searchForm">
        <input type="hidden" name="pageNum" id="pageNum"/>
        机构名称:<input type="text" name="name" value="${param.name}"/>
        地址:<input type="text" name="address" value="${param.address}"/>
        使用面积:<input type="text" name="minusedmianji" value="${param.minusedmianji}"/>-
                 <input type="text" name="maxusedmianji" value="${param.maxusedmianji}"/>
        设置床位:<input type="text" name="minchuangwei" value="${param.minchuangwei}"/>-
                 <input type="text" name="maxchuangwei" value="${param.maxchuangwei}"/>
        <input type="submit" value="查询"/>
        <input type="reset" value="清空"/>
    </form>
</div>
<br>
<br>
<div align="center">
    <table title="机构信息" align="center" width="100%" border="1" cellspacing="0" class="info">
        <tr align="center">
            <th width="20%">机构名称</th>
            <th width="30%">地址</th>
            <th>使用面积</th>
            <th>设置床位(张)</th>
            <th>收费标准(元/月)</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${pageInfo.list}" var="jg">
            <tr align="center">
                <td>${jg.name}</td>
                <td>${jg.address}</td>
                <td>${jg.usedmianji}</td>
                <td>${jg.chuangwei}</td>
                <td>${jg.shoufei}</td>
                <td>
                    <a href="/jigou.html?act=getJiGouById&id=${jg.id}">修改</a>/
                    <a href="#" onclick="dodelete(${jg.id})">刪除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
<br>
<style type="text/css">
    .info tr{background: yellow;}
    .info tr:nth-child(even){background: yellowgreen;}
</style>

当前第${pageInfo.pageNum}页/共${pageInfo.pages}页
<!--如果是没有上一页，就不显示上一页的连接-->
<c:if test="${pageInfo.hasPreviousPage}">
    <a href="#" onclick="page(${pageInfo.pageNum-1})">上一页</a>
</c:if>

<!--导航栏上显示几个-->
<c:forEach items="${pageInfo.navigatepageNums}" var="nav">
    <a href="#" onclick="page(${nav})" style="${pageInfo.pageNum==nav?'color:black':''}">${nav}</a>
</c:forEach>

<!--如果没有下一页，就不限时下一页连接-->
<c:if test="${pageInfo.hasNextPage}">
    <a href="#" onclick="page(${pageInfo.pageNum+1})">下一页</a>
</c:if>

<input type="text" id="go" value="${param.pageNum}"><input type="button" value="跳转" onclick="goPage()"/>

<script type="text/javascript" src="jquery-1.10.2.min.js"></script>
<script type="text/javascript">
    function page(pageNum) {
        $("#pageNum").val(pageNum);
        $("#searchForm").submit();
    }

    function goPage() {
        var pageNum = $('#go').val();
        if (isNaN(pageNum)) {
            alert("必须输入整数")
            return;
        }
        if (pageNum > parseInt("${pageInfo.pages}")) {
            pageNum = parseInt("${pageInfo.pages}");
        }
        if (pageNum < 1) {
            pageNum = 1;
        }
        page(pageNum)
    }

    function dodelete(id) {
        if(confirm("确定删除?")) {
            this.location = "/jigou.html?act=delete&id="+id;
        } else {
            return false;
        }
    }

</script>

<br>
<br>
<div align="center">
    <a href="jigou_add.jsp">添加</a>
    <input onclick="getExplorer()" type="submit" value="导出Excel"/>
</div>

</body>
</html>
