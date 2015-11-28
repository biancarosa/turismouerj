<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title></title>
  <jsp:include page="../header.jsp" />
</head>
<body>
<jsp:include page="../menu.jsp" />
<div class="container">
  <h1>Lista de Funcionários</h1>
  <table class="table table-striped">
    <tr>
      <th>Nome</th>
      <th>Cargo</th>
      <th>Login</th>
    </tr>
    <c:forEach items="${funcionarios}" var="funcionario">
      <tr>
        <td>${funcionario.getNome()}</td>
        <td>${funcionario.getCargo()}</td>
        <td>${funcionario.getLogin()}</td>
     </tr>
    </c:forEach>
  </table>
</div>
<jsp:include page="../footer.jsp" />
</body>
</html>
