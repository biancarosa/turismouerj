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
    <form:form action="/funcionario/salvar" method="post" modelAttribute="funcionario">
    <div class="col-sm-12">
        <h2>Dados pessoais</h2>
        <div class="row">
            <div class="form-group col-sm-8">
                <label for="nome">Nome</label>
                <form:input type="nome" class="form-control" id="nome" path="nome" placeholder="Nome" />
            </div>
        </div>
    </div>
    <div class="col-sm-12">
        <h2>Endere&ccedil;o</h2>

        <div class="row">
            <div class="form-group col-sm-6">
                <label for="logradouro">Logradouro</label>
                <form:input type="logradouro" class="form-control" id="logradouro" path="endereco.logradouro" placeholder="Logradouro" />
            </div>
            <div class="form-group col-sm-6">
                <label for="complemento">Complemento</label>
                <form:input type="complemento" class="form-control" id="complemento" path="endereco.complemento" placeholder="Complemento" />
            </div>
        </div>
        <div class="row">
            <div class="form-group col-sm-5">
                <label for="bairro">Bairro</label>
                <form:input type="bairro" class="form-control" id="bairro" path="endereco.bairro" placeholder="Bairro" />
            </div>
            <div class="form-group col-sm-5">
                <label for="cidade">Cidade</label>
                <form:input type="cidade" class="form-control" id="cidade" path="endereco.cidade" placeholder="Cidade" />
            </div>
            <div class="form-group col-sm-2">
                <label for="uf">UF</label>
                <form:input type="uf" class="form-control" id="uf" path="endereco.uf" placeholder="UF" />
            </div>
        </div>
        <div class="row">
            <div class="form-group col-sm-4">
                <label for="cep">CEP</label>
                <form:input type="cep" class="form-control" id="cep" path="endereco.cep" placeholder="CEP" />
            </div>
        </div>
        <button type="submit" class="btn btn-default pull-right">Criar</div>
</div>
</form:form>
</div>
<jsp:include page="../footer.jsp" />
</body>
</html>
