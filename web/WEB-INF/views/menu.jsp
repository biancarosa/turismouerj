<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!-- Fixed navbar -->
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">TurismoUERJ</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="dropdown">
                <li class="active"><a href="#">Home</a></li>
                <sec:authorize access="hasRole('ROLE_MANAGER')">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                       aria-haspopup="true" aria-expanded="false">Funcion&aacute;rio <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/funcionario/criar">Criar</a></li>
                        <li><a href="/funcionario/listar">Listar</a></li>
                    </ul>
                </li>
                </sec:authorize>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                       aria-haspopup="true" aria-expanded="false">Pacotes <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/pacote/criar?tipo=aereo">Criar pacote a&eacute;reo</a></li>
                        <li><a href="/pacote/criar?tipo=rodoviario">Criar pacote rodovi&aacute;rio</a></li>
                        <li><a href="/pacote/listar">Listar</a></li>
                    </ul>
                </li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>