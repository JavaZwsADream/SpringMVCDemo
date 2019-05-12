<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form id="form" action="/voParam" method="post">
      <table>
       <tr>
           <td>角色名称</td>
           <td>
               <input type="text" id="real_Name" name="real_Name" value="">
           </td>
       </tr>

          <tr>
              <td>备注</td>
              <td>
                  <input type="text" id="note" name="note" value="">
              </td>
          </tr>

          <tr>
              <td>
                  <input id="submit"  type="submit"  value="提交">
              </td>
          </tr>

      </table>
  </form>

</body>
<script src="../js/jquery.js"/>

</html>
