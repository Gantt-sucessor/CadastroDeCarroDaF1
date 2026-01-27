package dev.FaF1.CadastroDeCarroDaF1.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

//Entity transforma uma classe em uma entidade do DB
@Entity
@Table(name = "tb_cadastro_de_carros")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY
    )
    Long id;

    @Column(unique = true)
    private String nomeCarro;

    private String descricaoPinturaCarro;
    private LocalDate dataLancamento;

    //@ManyToOne um carro tem apenas UMA ÚNICA equipe
    @ManyToOne()
    @JoinColumn(name = "equipes_id") //Foreign KEY ou CHAVE ESTRANGEIRA
    private EquipesModel equipes;



}
