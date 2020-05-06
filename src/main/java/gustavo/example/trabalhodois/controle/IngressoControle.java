package gustavo.example.trabalhodois.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import gustavo.example.trabalhodois.modelo.Ingresso;


@RestController
public class IngressoControle {


    @GetMapping("/")
    public String message() {
        return "Bem-vindo, visualize às informações do ingresso.";
    }

    @GetMapping ("/Ingresso")
        public Ingresso getIngresso(){
        Ingresso ingresso = new Ingresso();
        ingresso.setNomeFilm("A escolha de Sofia");
        ingresso.setHorario("21:15");
        ingresso.setPreco(12.00);
            return ingresso;
    }

}
