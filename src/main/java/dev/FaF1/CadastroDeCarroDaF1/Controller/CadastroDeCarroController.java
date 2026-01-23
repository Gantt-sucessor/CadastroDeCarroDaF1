package dev.FaF1.CadastroDeCarroDaF1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CadastroDeCarroController {

    @GetMapping("/voltamo")
    public String boasVindas(){
        return "Minha primeira rota real";
    }

    @GetMapping("/voltamo/testando")
    public String boasSaidas(){
        return "Meu primeiro teste de rota real";
    }
}
