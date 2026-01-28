package dev.FaF1.CadastroDeCarroDaF1.Controller;

import dev.FaF1.CadastroDeCarroDaF1.Model.CarroModel;
import dev.FaF1.CadastroDeCarroDaF1.Repository.CarroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carro")
public class CarroController {

    private final CarroRepository carroRepository;

    public CarroController(CarroRepository carroRepository){
        this.carroRepository = carroRepository;
    }

    @PostMapping
    public CarroModel salvarCarro(@RequestBody CarroModel carroModel){
        return carroRepository.save(carroModel);
    }

    @GetMapping
    public List<CarroModel>listarCarro(){
        return carroRepository.findAll();
    }
}
