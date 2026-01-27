package dev.FaF1.CadastroDeCarroDaF1.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_equipes")
public class EquipesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String nome;
    private String modelo;

    //Uma equipe pode ter VÁRIOS carros
    @OneToMany(mappedBy = "equipes")
    private List<CarroModel> carros;

    public EquipesModel() {

    }

    public EquipesModel(String nomeDaEquipe, String modelo) {
        this.nome = nomeDaEquipe;
        this.modelo = modelo;
    }

    public String getNomeDaEquipe() {
        return nome;
    }

    public void setNomeDaEquipe(String nomeDaEquipe) {
        this.nome = nomeDaEquipe;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
