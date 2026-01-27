package dev.FaF1.CadastroDeCarroDaF1.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

//Entity transforma uma classe em uma entidade do DB
@Entity
@Table(name = "tb_cadastro_de_carros")
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY
    )
    Long id;
    private String nomeCarro;
    private String descricaoPinturaCarro;
    private LocalDate dataLancamento;

    public CarroModel(){
    }

    public CarroModel(String nomeCarro, String descricaoPinturaCarro, LocalDate dataLancamento){
        this.nomeCarro = nomeCarro;
        this.descricaoPinturaCarro = descricaoPinturaCarro;
        this.dataLancamento = dataLancamento;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public String getDescricaoPinturaCarro() {
        return descricaoPinturaCarro;
    }

    public void setDescricaoPinturaCarro(String descricaoPinturaCarro) {
        this.descricaoPinturaCarro = descricaoPinturaCarro;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }


}
