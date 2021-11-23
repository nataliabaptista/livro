<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <!--Scriplet em java para o servidor-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!--Scriplet em java para o servidor-->
<!DOCTYPE html> <!--Definindo tipo do arquivo-->
<html> <!--Definindo onde começará a pagina-->
    <head> <!--Cabeçalho-->
        <meta charset="utf-8" /> <!--Definindo dados como padrão unicode, e passando a lógica utilizada para armazenar letras e números dentro de bits.-->
        <title>Livros</title> <!--Titulo do cabeçalho-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous"> <!--Definindo classe css para estilização, e usando estilo do bootstrap-->
    </head> <!--Fim do Cabeçalho-->
    <body> <!--Corpo-->
        <main class="container">  <!--Definindo parte principal e classe de estilização-->
        <h1>Livros</h1> <!--Titulo do corpo-->
        <a href="/livro/insert"  class="btn btn-primary">Novo livro</a> <!--Instanciando botão para inserir novo livro, utilizando modelo de botão do bootstrap-->
        <table> <!--Definindo a tabela-->
            <tr> <!--Definindo linha da tabela-->
                <th>ID</th> <!--Definindo campo ID da tabela-->
                <th>Título</th> <!--Definindo campo Título da tabela-->
            </tr> <!--Fim da linha da tabela-->
            <c:forEach var="l" items="${livros}"> <!--Definindo itens da tabela livros-->
                <tr> <!--Definindo linha da tabela-->
                    <td>${l.id}</td> <!--Definindo célula ID da tabela-->
                    <td>${l.titulo}</td> <!--Definindo célula Titulo da tabela-->
                    <td> <!--Definindo célula da tabela-->
                        <a href="/livro/update/${l.id}"  class="btn btn-primary">Atualizar livro</a> <!--Instanciando botão para atualizar livro, e que redireciona o usuario para o update-->
                    </td> <!--Fim da definição de célula da tabela-->
                    <td> <a href="/livro/delete/${l.id}"  class="btn btn-danger">Apagar livro</a></td> <!--Instanciando botão para apagar livro, e que redireciona o usuario para o delete-->
                </tr> <!--Fim da linha da tabela-->
            </c:forEach> <!--Fim da definição de itens da tabela livros-->
        </table> <!--Fim da tabela-->
        <h1>Lista de livros. Natália Mendes</h1></main> <!--Definindo titulo do corpo-->
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script> <!--Conectando programa com bootstrap-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script> <!--Conectando programa com bootstrap-->
    </main> <!--Encerrando parte principal-->
    </body> <!--Fim do Corpo-->
</html> <!--Fim código HTML-->
