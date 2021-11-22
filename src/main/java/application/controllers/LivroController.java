package application.controllers; // Importanto pacote responsável por fazer a intermediação entre camadas (View e Model).
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import application.models.Livro;
import application.repositories.LivroRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //Anotação dizendo que a próxima linha possuirá um controller.
@RequestMapping("/livro") // Anotação dizendo que a próxima linha é referente ao mapeamento da pasta livro (dentro do webapp). 
public class LivroController { //Criando classe livroController.
    @Autowired // Anotação dizendo que a próxima linha fornece controle sobre onde e como a ligação entre as classes será realizada.
    private LivroRepository livrosRepo; 
    @RequestMapping("/list") // Anotação dizendo que a próxima linha é referente ao mapeamento do arquivo list (dentro da pasta livro). 
    public String list(Model model){ 
        model.addAttribute("livros", livrosRepo.findAll());
        return "list.jsp";
        
    }
    public String listar(){
        return "livro/list.jsp";
      }
      
      @RequestMapping("/insert")
      public String formInsert(){
          return "insert.jsp";
      }

      @RequestMapping(value="/insert",method=RequestMethod.POST)
      public String saveInsert(@RequestParam("titulo")String titulo){
          Livro livro = new Livro();
          livro.setTitulo(titulo);
          livrosRepo.save(livro);
          return "redirect:/livro/list";
      }

      @RequestMapping("/delete/{id}")
      public String formDelete(Model model, @PathVariable int id){
        Optional<Livro> livro=livrosRepo.findById(id);
        if (!livro.isPresent())
            return "redirect:/livro/list";
        model.addAttribute("livro", livro.get());
          return "/livro/delete.jsp";
      }

      @RequestMapping(value = "/delete", method=RequestMethod.POST)
      public String confirmDelete(@RequestParam("id")int id){
          livrosRepo.deleteById(id);
            return "redirect:/livro/list";
      }

      @RequestMapping("/update/{id}")
      public String formUpdate(Model model, @PathVariable int id){
        Optional<Livro> livro=livrosRepo.findById(id);
        if (!livro.isPresent())
            return "redirect:/livro/list";
        model.addAttribute("livro", livro.get());
          return "/livro/update.jsp";
      }

      @RequestMapping(value = "/update", method=RequestMethod.POST)
      public String saveUpdate(@RequestParam("titulo")String titulo, @RequestParam("id")int id){
        Optional<Livro> livro=livrosRepo.findById(id);
        if (!livro.isPresent())
            return "redirect:/livro/list";
        livro.get().setTitulo(titulo);
        livrosRepo.save(livro.get());
        return "redirect:/livro/list";
      }
}

