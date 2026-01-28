package dev.FaF1.CadastroDeCarroDaF1.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="tb_equipes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EquipesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String nome;
    private String modelo;

    //Uma equipe pode ter VÁRIOS carros
    @OneToMany(mappedBy = "equipes")
    @com.fasterxml.jackson.annotation.JsonIgnore
    private List<CarroModel> carros;


}
