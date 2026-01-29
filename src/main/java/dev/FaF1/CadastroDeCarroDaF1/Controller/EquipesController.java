package dev.FaF1.CadastroDeCarroDaF1.Controller;

import dev.FaF1.CadastroDeCarroDaF1.Model.EquipesModel;
import dev.FaF1.CadastroDeCarroDaF1.Repository.EquipesRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipes")
public class EquipesController {

    private final EquipesRepository equipesRepository;

    public EquipesController(EquipesRepository equipesRepository) {
        this.equipesRepository = equipesRepository;
    }

    @PostMapping
    public EquipesModel criarEquipes(@RequestBody EquipesModel equipesModel){
        return equipesRepository.save(equipesModel);
    }

    @GetMapping
    public List<EquipesModel> listarEquipes(){
        return equipesRepository.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<EquipesModel> atualizarEquipes(@PathVariable Long id, @RequestBody EquipesModel equipesAtualizada){
        return equipesRepository.findById(id).map(equipeSalva ->{
            equipeSalva.setNome(equipesAtualizada.getNome());
            equipeSalva.setModelo(equipesAtualizada.getModelo());

            EquipesModel equipeSalvaAtualizada = equipesRepository.save(equipeSalva);

            return ResponseEntity.ok(equipeSalvaAtualizada);
        })
        .orElse(ResponseEntity.notFound().build());
    }
}
