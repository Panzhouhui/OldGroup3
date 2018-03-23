<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<body>
<title>t机构添加表</title>
<form action="/jigou.html?act=add" method="post">
	机构名称:<input type="text" name="name" required="required" /></br>
	申请人姓名:<input type="text" name="shen_name" /></br>
	申请人性别:
		<input type="radio" name="shen_sex" value="1" checked/>男
		<input type="radio" name="shen_sex" value="0">女</br>
	申请人出生日期:<input type="text" name="shen_brithday"/></br>
	申请人公司电话:<input type="text" name="shen_tel"/></br>
	机构地址:<input type="text" name="address" /></br>
	法定代表人:<input type="text" name="fd_name" /></br>
	法定代表人电话:<input type="text" name="fd_tel"/></br>
	机构代表人:<input type="text" name="jg_name" /></br>
	机构代表人电话:<input type="text" name="jg_tel" /></br>
	建筑面积:<input type="text" name="mianji" /></br>
	使用面积:<input type="text" name="usedmianji" /></br>
	建筑形式:<input type="text" name="xingshi" /></br>
	设置床位:<input type="text" name="chuangwei" /></br>
	房权证单位:<input type="text" name="fqdw_name" /></br>
	租赁期限:<input type="text" name="zudate" /></br>
	投资总额:<input type="text" name="touzong" /></br>
	资产性质:<input type="text" name="xingzhi" /></br>
	注册资金:<input type="text" name="zhucezijin" /></br>
	收费标准:<input type="text" name="shoufei" /></br>
	备注:<input type="text" name="beizhu" /></br>
	<input type="submit" value="提交" />
	<input type="reset" value="清空" />
</form>
</body>
</html>
