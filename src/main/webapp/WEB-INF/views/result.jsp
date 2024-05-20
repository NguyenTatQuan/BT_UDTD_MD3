<%--
  Created by IntelliJ IDEA.
  User: QUAN
  Date: 20/05/2024
  Time: 8:32 SA
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <title>Translation Result</title>
</head>
<body>
<h2>Translation Result</h2>
<c:choose>
    <c:when test="${not empty meaning}">
        <p>The meaning of <strong>${word}</strong> is: <strong>${meaning}</strong></p>
    </c:when>
    <c:otherwise>
        <p>${message}</p>
    </c:otherwise>
</c:choose>
<a href="/">Translate another word</a>
</body>
</html>
