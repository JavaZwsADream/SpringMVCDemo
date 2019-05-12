<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/11
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>校验框架</title>
</head>
<body>
<form action="./valiate/annotation">
    <table>
        <tr>
        <td>产品编号:</td>
        <td>
            <input type="text" name="productId" id="productId">
        </td>
        </tr>

        <tr>
            <td>用户编号:</td>
            <td>
                <input type="text" name="userId" id="userId">
            </td>
        </tr>
        <tr>
            <td>交易日期:</td>
            <td>
                <input type="text" name="date" id="date">
            </td>
        </tr>
        <tr>
            <td>价格:</td>
            <td>
                <input type="text" name="price" id="price">
            </td>
        </tr>

        <tr>
            <td>数量:</td>
            <td>
                <input type="text" name="quantity" id="quantity">
            </td>
        </tr>

        <tr>
            <td>交易金额:</td>
            <td>
                <input type="text" name="amount" id="amount">
            </td>
        </tr>
        <tr>
            <td>用户邮件:</td>
            <td>
                <input type="text" name="email" id="email">
            </td>
        </tr>
        <tr>
            <td>备注:</td>
            <td>
                <textarea id="note" name="note" cols="20" rows="5" />
            </td>
        </tr>
        <tr>

            <td colspan="2" align="right">
            <input type="submit" value="提交">
            </td>
        </tr>

    </table>
</form>
</body>
</html>
