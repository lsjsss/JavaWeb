<%--
  Created by IntelliJ IDEA.
  User: lsjss
  Date: 2020/9/5
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>login</title>
</head>
<body>
<!--
    1 对于表单来说，最重要的两个属性
         - method：用于指明该表单form向后台提交数据的方式是get或post方式，一般设置为post
         - action：指明该表单数据要提交到后台的地址
    2 在表单中的标签中的数据必须通过  name 属性传递到后台，不是id或其他属性
 -->
<form method="post" action="FormServlet">
    <table border="1" align="center">
        <tr>
            <td>账号：</td>
            <td><input type="text" name="loginName"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>爱好：</td>
            <td>
                <input type="checkbox" name="favors" value="看电影">看电影
                <input type="checkbox" name="favors" value="听音乐">听音乐
                <input type="checkbox" name="favors" value="吃美食">吃美食
            </td>
        </tr>
        <tr>
            <td cosplan="2" align="center"><input type="submit" name="btlogin"></td>
        </tr>
    </table>
</form>
</body>
</html>
