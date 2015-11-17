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
  <form:form action="/funcionario/salvar" method="post">
      <input type="hidden" name="criar" value="true" />
      <div class="col-sm-12">
          <h2>Dados pessoais</h2>
          <div class="row">
              <div class="form-group col-sm-8">
                  <label for="nome">Nome</label>
                  <input type="nome" class="form-control" id="nome" placeholder="Nome">
              </div>
          </div>
      </div>
      <div class="col-sm-12">
          <h2>Endere&ccedil;o</h2>

          <div class="row">
              <div class="form-group col-sm-6">
                  <label for="logradouro">Logradouro</label>
                  <input type="logradouro" class="form-control" id="logradouro" placeholder="Logradouro" />
              </div>
              <div class="form-group col-sm-6">
                  <label for="complemento">Complemento</label>
                  <input type="complemento" class="form-control" id="complemento" placeholder="Complemento" />
              </div>
          </div>
          <div class="row">
              <div class="form-group col-sm-5">
                  <label for="bairro">Bairro</label>
                  <input type="bairro" class="form-control" id="bairro" placeholder="Bairro" />
              </div>
              <div class="form-group col-sm-5">
                  <label for="cidade">Cidade</label>
                  <input type="cidade" class="form-control" id="cidade" placeholder="Cidade" />
              </div>
              <div class="form-group col-sm-2">
                  <label for="uf">UF</label>
                  <input type="uf" class="form-control" id="uf" placeholder="UF" />
              </div>
          </div>
          <div class="row">
              <div class="form-group col-sm-4">
                  <label for="cep">CEP</label>
                  <input type="cep" class="form-control" id="cep" placeholder="CEP" />
              </div>
          </div>
          <button type="submit" class="btn btn-default pull-right">Criar</div>
      </div>
  </form:form>
</div>
<jsp:include page="../footer.jsp" />
</body>
</html>
