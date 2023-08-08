<%--
  Created by IntelliJ IDEA.
  User: ZIO
  Date: 2023-08-04
  Time: 오후 2:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List page</h1>
<ul>
    <c:forEach var="dto" items="${list}">
        <li>${dto}

        </li>
    </c:forEach>
</ul>
</body>
</html>
