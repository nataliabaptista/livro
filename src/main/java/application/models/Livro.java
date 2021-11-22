package application.models; // Importanto pacote da camada Model, responsável por ter as funções de consulta ao BD ou acesso a API.


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Fazendo anotação para informar que a linha posterior é uma entidade relacional.
@Table(name="livros") //Criando uma tabela com o nome livros.
public class Livro {

    @Id //Fazendo anotação para informar que a próxima linha é de criação de Id (Chave primária).
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Criando chave primária.
    private int id; //Criando variável Id.
    private String titulo; //Criando variável titulo.

    public int getId() { //Criando método get para obter valores da variável Id.
        return id;
    }
    public void setId(int id) { //Criando método set para definir valores da variável Id.
        this.id = id;
    }
    public String getTitulo() { //Criando método get para obter valores da variável titulo.
        return titulo;
    }
    public void setTitulo(String titulo) { //Criando método set para definir valores da variável titulo.
        this.titulo = titulo;
    }


    
}
