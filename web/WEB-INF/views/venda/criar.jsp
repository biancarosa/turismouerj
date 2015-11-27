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
    <form:form action="/venda/salvar" method="post" modelAttribute="venda">
    <h2>Dados do cliente</h2>
    <div class="col-sm-12">
        <h3>Dados pessoais</h3>
        <div class="row">
            <div class="form-group col-sm-4">
                <label for="CPF">CPF</label>
                <form:input type="text" class="form-control" id="cpf" path="cliente.cpf" placeholder="CPF" />
            </div>
            <div class="form-group col-sm-8">
                <label for="nome">Nome</label>
                <form:input type="text" class="form-control" id="nome" path="cliente.nome" placeholder="Nome" />
            </div>
        </div>
        <h3>Endere&ccedil;o</h3>
        <div class="row">
            <div class="form-group col-sm-6">
                <label for="logradouro">Logradouro</label>
                <form:input type="text" class="form-control" id="logradouro" path="cliente.endereco.logradouro" placeholder="Logradouro" />
            </div>
            <div class="form-group col-sm-6">
                <label for="complemento">Complemento</label>
                <form:input type="text" class="form-control" id="complemento" path="cliente.endereco.complemento" placeholder="Complemento" />
            </div>
        </div>
        <div class="row">
            <div class="form-group col-sm-5">
                <label for="bairro">Bairro</label>
                <form:input type="text" class="form-control" id="bairro" path="cliente.endereco.bairro" placeholder="Bairro" />
            </div>
            <div class="form-group col-sm-5">
                <label for="cidade">Cidade</label>
                <form:input type="text" class="form-control" id="cidade" path="cliente.endereco.cidade" placeholder="Cidade" />
            </div>
            <div class="form-group col-sm-2">
                <label for="uf">UF</label>
                <form:input type="text" class="form-control" id="uf" path="cliente.endereco.uf" placeholder="UF" />
            </div>
        </div>
        <div class="row">
            <div class="form-group col-sm-4">
                <label for="cep">CEP</label>
                <form:input type="text" class="form-control" id="cep" path="cliente.endereco.cep" placeholder="CEP" />
            </div>
        </div>
    </div>
    <form:input type="hidden" class="form-control" id="pacoteid" path="pacote.codigo" value="${venda.getPacote().getCodigo()}" />
    <button type="submit" class="btn btn-default pull-right">Criar</div>
</div>
</form:form>
</div>
<jsp:include page="../footer.jsp" />
</body>
</html>
