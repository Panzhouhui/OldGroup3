<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>养老机构信息修改页</title>
</head>

<body>
<form action="/jigou.html?act=update" method="post">
    <input type="hidden" name="id" value="${jigou.id}"/>

    机构名称:<input type="text" name="name" value="${jigou.name}"/>
    </br></br>
    申请人姓名:<input type="text" name="shen_name" value="${jigou.shen_name}"/>
    </br></br>
    申请人性别:
    <input type="radio" name="shen_sex" value="1" checked/>男
    <input type="radio" name="shen_sex" value="0"/>女
    </br></br>
    申请人出生日期:<input type="text" value="${jigou.shen_brithday}" name="shen_brithday"/>
    </br></br>
    申请人公司电话:<input type="text" name="shen_tel" value="${jigou.shen_tel}"/>
    </br></br>
    机构地址:<input type="text" name="address" value="${jigou.address}"/>
    </br></br>
    法定代表人:<input type="text" name="fd_name" value="${jigou.fd_name}"/>
    </br></br>
    法定代表人电话:<input type="text" name="fd_tel" value="${jigou.fd_tel}"/>
    </br></br>
    机构代表人:<input type="text" name="jg_name" value="${jigou.jg_name}"/>
    </br></br>
    机构代表人电话:<input type="text" name="jg_tel" value="${jigou.jg_tel}"/>
    </br></br>
    建筑面积:<input type="text" name="mianji" value="${jigou.mianji}"/>
    </br></br>
    使用面积:<input type="text" name="usedmianji" value="${jigou.usedmianji}"/>
    </br></br>
    建筑形式:<input type="text" name="xingshi" value="${jigou.xingshi}"/>
    </br></br>
    设置床位:<input type="text" name="chuangwei" value="${jigou.chuangwei}"/>
    </br></br>
    房权证单位:<input type="text" name="fqdw_name" value="${jigou.fqdw_name}"/>
    </br></br>
    租赁期限:<input type="text" name="zudate" value="${jigou.zudate}"/>
    </br></br>
    投资总额:<input type="text" name="touzong" value="${jigou.touzong}"/>
    </br></br>
    资产性质:<input type="text" name="xingzhi" value="${jigou.xingzhi}"/>
    </br></br>
    注册资金:<input type="text" name="zhucezijin" value="${jigou.zhucezijin}"/>
    </br></br>
    收费标准:<input type="text" name="shoufei" value="${jigou.shoufei}"/>
    </br></br>
    备注:<input type="text" name="beizhu" value="${jigou.beizhu}"/>
    </br></br>
    <input type="submit" value="提交"/>
    <input type="reset" value="重置"/>
</form>
</body>
</html>
