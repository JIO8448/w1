<%--
  Created by IntelliJ IDEA.
  User: ZIO
  Date: 2023-08-04
  Time: 오전 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>calcResult.jsp</title>
</head>
<body>
<h1>${param.num1} + ${param.num2} = ${param.num1 + param.num2}</h1>
<h1>sum ${Integer.parseInt(param.num1) + Integer.parseInt(param.num2)}</h1>

<%--웹의 파라미터는 모두 문자열--%>
</body>
</html>
