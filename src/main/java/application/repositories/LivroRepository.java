package application.repositories; // Importanto aplicação repositories.
import org.springframework.data.repository.CrudRepository; //Importando do framework Spring (usado para habilitar uma série de recursos), a interface CRUDRepository, que fornecerá métodos para as operações CRUD (Create, Read, Update e Delete).
import application.models.Livro; // Importanto aplicação da camada Model, responsável por ter as funções de consulta ao BD ou acesso a API.
public interface LivroRepository extends CrudRepository<Livro, Integer> { //Extendendo o repositorio de livros para o CrudRepository.

    

}