package application.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import application.models.Livro;
import application.repositories.LivroRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/livro")
public class LivroController {
    @Autowired
    private LivroRepository livrosRepo;
    @RequestMapping("/list")
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
}

