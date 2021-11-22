package application.controllers; // Pacote responsável por fazer a intermediação entre camadas (View e Model).
import org.springframework.stereotype.Controller; // Importando biblioteca stereotype controller.
import org.springframework.web.bind.annotation.RequestMapping; // Importando biblioteca request mapping - para fazer mapeamento.
import org.springframework.web.bind.annotation.RequestMethod; // Importando biblioteca request method.

@Controller
public class HomeController {
    @RequestMapping(method=RequestMethod.GET)
    public String index() {
        return "home/index.jsp";
    }
}