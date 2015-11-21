<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
  <title></title>
  <jsp:include page="../header.jsp" />
</head>
<body>
<jsp:include page="../menu.jsp" />
<div class="container">
  <form:form action="/pacote/salvar" method="post" modelAttribute="pacote">
      <div class="col-sm-12">
          <h2>Dados do pacote</h2>
          <div class="row">
              <div class="form-group col-sm-4">
                  <label for="nome">Origem</label>
                  <form:input type="text" class="form-control" id="origem" path="origem" placeholder="Origem" />
              </div>
              <div class="form-group col-sm-4">
                  <label for="nome">Destino</label>
                  <form:input type="text" class="form-control" id="destino" path="destino" placeholder="Destino" />
              </div>
          </div>
          <div class="row">
              <div class="form-group col-sm-3">
                  <label for="nome">Vagas</label>
                  <form:input type="number" class="form-control" id="vagas" path="vagas" placeholder="Vagas" />
              </div>
              <div class="form-group col-sm-6">
                  <label for="nome">Valor por pessoa</label>
                  <form:input type="number" class="form-control" id="valorPorPessoa" path="valorPorPessoa" placeholder="Valor por pessa" />
              </div>
              <div class="form-group col-sm-3">
                  <label for="nome">Permanencia</label>
                  <form:input type="number" class="form-control" id="permanencia" path="permanencia" placeholder="Permanencia" />
              </div>
          </div>
          <div class="row">
              <div class="form-group col-sm-4">
                  <label for="nome">Data de Ida</label>
                  <form:input type="date" class="form-control" id="dataIdaViagem" path="dataIdaViagem" placeholder="Data de volta" />
              </div>
              <div class="form-group col-sm-4">
                  <label for="nome">Data de Volta</label>
                  <form:input type="date" class="form-control" id="dataVoltaViagem" path="dataVoltaViagem" placeholder="Data de volta" />
              </div>
          </div>
      </div>
  </form:form>
</div>
<jsp:include page="../footer.jsp" />
</body>
</html>
