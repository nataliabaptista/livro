package application.controllers; // Pacote responsável por fazer a intermediação entre camadas (View e Model).
import org.springframework.stereotype.Controller; // Importando biblioteca stereotype controller.
import org.springframework.web.bind.annotation.RequestMapping; //Importando do framework Spring (usado para habilitar uma série de recursos), a anotação @RequestMapping, que fará o mapeamento, com a implementação de uma URL e o método (Post ou Get).
import org.springframework.web.bind.annotation.RequestMethod; //Importando do framework Spring (usado para habilitar uma série de recursos), a anotação @RequestMethod, que será utilizada para implementar URL handler.

@Controller //Anotação dizendo que a próxima linha possuirá um controller.
public class HomeController { //Criando classe homeController.
    @RequestMapping(method=RequestMethod.GET) // Anotação dizendo que a próxima linha é referente ao mapeamento do método get.
    public String index() { //Criando método index.
        return "home/index.jsp";
    }
}