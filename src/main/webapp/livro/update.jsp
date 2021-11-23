<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <!--Scriplet em java para o servidor-->
<!DOCTYPE html> <!--Definindo tipo do arquivo-->
<html> <!--Definindo onde começará a pagina-->
    <head> <!--Cabeçalho-->
        <meta charset="utf-8" /> <!--Definindo dados como padrão unicode, e passando a lógica utilizada para armazenar letras e números dentro de bits.-->
        <title>Editar Livro</title> <!--Titulo do cabeçalho-->
    </head> <!--Fim do Cabeçalho-->
    <body> <!--Corpo-->
        <h1>Editar Livro</h1> <!--Titulo do corpo-->
        <hr> <!--Instanciando uma linha-->
        <form action="/livro/update" method="post"> <!--Instanciando formulário de inserir dados, e definindo o método como Post-->
            <input type="hidden" name="id" value="${livro.id}"/> <!--Instanciando input para entrada dos dados e definindo o nome e o valor do mesmo-->
            <label for="titulo">Título</label> <!--Escrevendo rótulo "Título"-->
            <input type="text" name="titulo" value="${livro.titulo}"/> <!--Instanciando input para entrada do titulo-->
            <a href="/livro/list">Voltar</a> <!--Instanciando botão para voltar para a pagina list-->
            <input type="submit" value="Salvar"/> <!--Instanciando input para apagar os dados-->
        </form> <!--Fechando formulario-->
    </body> <!--Fim do Corpo-->
</html> <!--Fim código HTML-->