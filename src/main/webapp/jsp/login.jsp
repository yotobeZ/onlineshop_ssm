<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>首页</title>
</head>
<script src="../resources/js/jquery-1.12.4.js"/>
<script>
</script>
<body>

<div id="class" align="center">

    <sp:form action="/login" method="post" modelAttribute="Userlog" >
        username:<sp:input path="logName" type="text" name="username" id="username"/><br>
        password:<sp:input path="logPassword" type="text" name="password" id="password"/><br>
        <tr >
            <td><input type="submit" value="登录"  ></td>
            <td><input type="button" value="注册" onclick="window.location.href='/jsp/index2.jsp'"> </td>
        </tr>

    </sp:form>

</div>

</body>
</html>
