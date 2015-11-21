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
  <h1>Lista de pacotes</h1>
    <table class="table table-striped">
        <tr>
            <th>Origem</th>
            <th>Destino</th>
            <th>Valor por pessoa</th>
            <th>Permanência</th>
            <th>Vagas</th>
            <th>Data de Ida</th>
            <th>Data de Volta</th>
            <th>Classe</th>
            <th>Tipo de ônibus</th>
        </tr>
      <c:forEach items="${pacotes}" var="pacote">
        <tr>
            <td>${pacote.getOrigem()}</td>
            <td>${pacote.getDestino()}</td>
            <td>${pacote.getValorPorPessoa()}</td>
            <td>${pacote.getPermanencia()}</td>
            <td>${pacote.getVagas()}</td>
            <td>${pacote.getDataIdaViagem()}</td>
            <td>${pacote.getDataVoltaViagem()}</td>
            <td>${pacote['class'].name == "br.uerj.ime.produtos.PacoteAereo"? pacote.getClasse() : "Não se aplica"}</td>
            <td>${pacote['class'].name == "br.uerj.ime.produtos.PacoteRodoviario"? pacote.getTipoOnibus() : "Não se aplica"}</td>
        </tr>
      </c:forEach>
    </table>
</div>
<jsp:include page="../footer.jsp" />
</body>
</html>
