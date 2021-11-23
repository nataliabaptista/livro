<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <!--Scriplet em java para o servidor-->
<!DOCTYPE html> <!--Definindo tipo do arquivo-->
<html> <!--Definindo onde começará a pagina-->
    <head> <!--Cabeçalho-->
        <meta charset="utf-8" /> <!--Definindo dados como padrão unicode, e passando a lógica utilizada para armazenar letras e números dentro de bits.-->
        <title>Novo Livro</title> <!--Titulo do cabeçalho-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous"> <!--Definindo classe css para estilização, e usando estilo do bootstrap-->
    </head> <!--Fim do Cabeçalho-->
    <body> <!--Corpo-->
        <h1>Novo Livro</h1> <!--Titulo do corpo-->
        <hr> <!--Instanciando uma linha-->
        <form action="insert" method="post"> <!--Instanciando formulário de inserir dados, e definindo o método como Post-->
            <label for="titulo">Título</label> <!--Escrevendo rótulo "Título"-->
            <input type="text" name="titulo"/> <!--Instanciando input para entrada do titulo-->
            <a href="/livro/list" class="btn btn-info">Voltar</a> <!--Instanciando botão para voltar para a pagina list, utilizando modelo de botão do bootstrap-->
            <input type="submit" value="Salvar" class="btn btn-success"> <!--Instanciando input para salvar os dados, utilizando modelo de botão do bootstrap-->
        </form> <!--Fechando formulario-->
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script> <!--Conectando programa com bootstrap-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script> <!--Conectando programa com bootstrap-->
    </body> <!-- Fim do Corpo-->
</html> <!--Fim código HTML-->