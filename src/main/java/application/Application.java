package application; // Importanto pacote responsável por fazer a intermediação entre camadas (View e Model).

import org.springframework.boot.SpringApplication; //Importando do framework Spring (usado para habilitar uma série de recursos), a classe SpringApplication, que habilita recursos de configuração, varreduras de componentes entre outros recursos.
import org.springframework.boot.autoconfigure.SpringBootApplication; //Importando do framework Spring (usado para habilitar uma série de recursos), a classe SpringApplication, que habilita recursos de configuração, varreduras de componentes entre outros recursos.

@SpringBootApplication //Habilitando recursos do Spring boot.
public class Application { //Criando classe de aplicação
    public static void main(String[] args) { //Criando método main.
        SpringApplication.run(Application.class, args);
    }
}