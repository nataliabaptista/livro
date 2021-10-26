<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Apagar Livro</title>
    </head>
    <body>
        <h1>Apagar Livro</h1>
        <hr>
        <p>Tem certeza que deseja apagar o livro?<em>"${livro.titulo}"</em>?</p>
        <form action="/livro/delete" method="post">
            <input type="hidden" name="id" value="${livro.id}"
            <label for="titulo">Título</label>
            <input type="text" name="titulo"/>


            <a href="/livro/list">Voltar</a>
            <input type="submit" value="Apagar">
        </form>
    </body>
</html>