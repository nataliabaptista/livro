package application.controllers; // Importanto pacote responsável por fazer a intermediação entre camadas (View e Model).
import java.util.Optional; //Importando classe Optional, que facilitará a implementação dos códigos.
import org.springframework.beans.factory.annotation.Autowired; //Importando do framework Spring (usado para habilitar uma série de recursos), a anotação @AutoWired, que fornecerá controle sobre onde e como a ligação entre as classes será realizada.
import org.springframework.stereotype.Controller;  //Importando do framework Spring (usado para habilitar uma série de recursos), a anotação @Controller, que marca a classe anotada como uma camada de negócios ou apresentação.
import org.springframework.web.bind.annotation.PathVariable;  //Importando do framework Spring (usado para habilitar uma série de recursos), a anotação @PathVariable, que irá obter espaço reservado no URI.
import org.springframework.web.bind.annotation.RequestMapping; //Importando do framework Spring (usado para habilitar uma série de recursos), a anotação @RequestMapping, que fará o mapeamento, com a implementação de uma URL e o método (Post ou Get).
import application.models.Livro; //Importando arquivo livro que está dentro da pasta model - e que cuidará das funções de consulta ao BD ou acesso a API.
import application.repositories.LivroRepository; //Importando repositorios de livros que está na pasta repositories.
import org.springframework.ui.Model; //Importando do framework Spring (usado para habilitar uma série de recursos), a interface Model (UI) que facilitará a implementação de modelos de user interface.
import org.springframework.web.bind.annotation.RequestMethod; //Importando do framework Spring (usado para habilitar uma série de recursos), a anotação @RequestMethod, que será utilizada para implementar URL handler.
import org.springframework.web.bind.annotation.RequestParam; //Importando do framework Spring (usado para habilitar uma série de recursos), a anotação @RequestParam, que irá mapear os parâmetros da requisição GET/POST para o seu argumento de método.

@Controller //Anotação dizendo que a próxima linha possuirá um controller.
@RequestMapping("/livro") // Anotação dizendo que a próxima linha é referente ao mapeamento da pasta livro (dentro do webapp). 
public class LivroController { //Criando classe livroController.
    @Autowired // Anotação dizendo que a próxima linha fornece controle sobre onde e como a ligação entre as classes será realizada.
    private LivroRepository livrosRepo; //Criando livrosRepo do LivrosRepository.
    @RequestMapping("/list") //Anotação dizendo que a próxima linha é referente ao mapeamento do arquivo list (dentro da pasta livro). 
    public String list(Model model){  //Criando método para montar lista de atributos dos livros.
        model.addAttribute("livros", livrosRepo.findAll());
        return "list.jsp";
        
    }
    public String listar(){ //Criando método para listar os atributos dos livros.
        return "livro/list.jsp";
      }
      
      @RequestMapping("/insert") //Anotação dizendo que a próxima linha é referente ao mapeamento do arquivo insert (dentro da pasta livro). 
      public String formInsert(){ //Criando método para retornar os dados do insert.
          return "insert.jsp";
      }

      @RequestMapping(value="/insert",method=RequestMethod.POST) //Anotação dizendo que a próxima linha é referente ao mapeamento do arquivo insert, e definindo o método do mesmo, que é o post. 
      public String saveInsert(@RequestParam("titulo")String titulo){ //Criando método para salvar os dados no insert, e passando o parametro titulo.
          Livro livro = new Livro(); //Criando novo objeto livro.
          livro.setTitulo(titulo); //Adicionando livro pelo titulo.
          livrosRepo.save(livro); //Salvando novo livro no repositório de livros.
          return "redirect:/livro/list"; //Saída do método - redirecionando para a lista de livros.
      }

      @RequestMapping("/delete/{id}") //Anotação dizendo que a próxima linha é referente ao mapeamento do arquivo delete, usado para apagar livros pela chave primária. 
      public String formDelete(Model model, @PathVariable int id){ //Criando método para apagar os dados.
        Optional<Livro> livro=livrosRepo.findById(id); //Buscando livro no repositório pela chave primária.
        if (!livro.isPresent()) //Criando método para que caso o livro não esteja presente, retorne a lista de livros.
            return "redirect:/livro/list";
        model.addAttribute("livro", livro.get()); //Obtendo informações do livro.
          return "/livro/delete.jsp";
      }

      @RequestMapping(value = "/delete", method=RequestMethod.POST) //Anotação dizendo que a próxima linha é referente ao mapeamento para apagar livros, e definindo o método do mesmo, que é o post. 
      public String confirmDelete(@RequestParam("id")int id){ //Criando método para confirmar que deseja apagar os dados.
          livrosRepo.deleteById(id); //Método para apagar o livro com base em sua chave primária.
            return "redirect:/livro/list"; //Redireciona para a lista de livros.
      }

      @RequestMapping("/update/{id}") //Anotação dizendo que a próxima linha é referente ao mapeamento do arquivo update, onde os dados serão atualizados pela chave primária. 
      public String formUpdate(Model model, @PathVariable int id){ //Criando método para atualizar os dados.
        Optional<Livro> livro=livrosRepo.findById(id); //Buscando livro no repositório pela chave primária.
        if (!livro.isPresent()) //Criando método para que caso o livro não esteja presente, retorne a lista de livros.
            return "redirect:/livro/list";
        model.addAttribute("livro", livro.get()); //Obtendo informações do livro.
          return "/livro/update.jsp";
      }

      @RequestMapping(value = "/update", method=RequestMethod.POST) //Anotação dizendo que a próxima linha é referente ao mapeamento para atualizar os livros, e definindo o método do mesmo, que é o post. 
      public String saveUpdate(@RequestParam("titulo")String titulo, @RequestParam("id")int id){ //Criando método para salvar as atualizações dos dados, passando o parametro titulo e id.
        Optional<Livro> livro=livrosRepo.findById(id); //Buscando livro no repositório pela chave primária.
        if (!livro.isPresent()) //Criando método para que caso o livro não esteja presente, retorne a lista de livros.
            return "redirect:/livro/list";
        livro.get().setTitulo(titulo); //Criando método get e set para obter os dados e definir os valores, usando o titulo como parametro. 
        livrosRepo.save(livro.get()); //Salvando no repositório de livros os novos dados, e redirecionando para a lista de livros.
        return "redirect:/livro/list";
      }
}

