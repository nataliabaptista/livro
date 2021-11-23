<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <!--Scriplet em java para o servidor-->
<!DOCTYPE html> <!--Definindo tipo do arquivo-->
<html> <!--Definindo onde começará a pagina-->
    <head> <!--Cabeçalho-->
        <meta charset="utf-8" /> <!--Definindo dados como padrão unicode, e passando a lógica utilizada para armazenar letras e números dentro de bits.-->
        <title>Apagar Livro</title> <!--Titulo do cabeçalho-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous"> <!--Definindo classe css para estilização, e usando estilo do bootstrap-->
    </head> <!--Fim do Cabeçalho-->
    <body> <!--Corpo-->
        <main class="container"> <!--Definindo parte principal e classe de estilização-->
        <h1>Apagar Livro</h1> <!--Titulo do corpo-->
        <hr> <!--Instanciando uma linha-->
        <p>Tem certeza que deseja apagar o livro?<em>"${livro.titulo}"</em>?</p> <!--Escrevendo mensagem para o usuário e apresentando o titulo do livro-->
        <form action="/livro/delete" method="post"> <!--Instanciando formulário e definindo caminho de ação, e o método Post-->
            <input type="hidden" name="id" value="${livro.id}"/> <!--Instanciando input para entrada dos dados e definindo o nome e o valor do mesmo-->
            <a href="/livro/list" class="btn btn-light">Voltar</a> <!--Instanciando botão para voltar para a pagina list, utilizando modelo de botão do bootstrap-->
            <input type="submit" value="Apagar" class="btn btn-warning"/> <!--Instanciando input para apagar os dados, utilizando modelo de botão do bootstrap-->
        </form> <!--Fechando formulario-->
    </main> <!--Encerrando parte principal-->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script> <!--Conectando programa com bootstrap-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script> <!--Conectando programa com bootstrap-->
    </body> <!--Fim do Corpo-->
</html> <!--Fim código HTML-->