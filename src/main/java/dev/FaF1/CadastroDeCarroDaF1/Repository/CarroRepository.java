package dev.FaF1.CadastroDeCarroDaF1.Repository;

import dev.FaF1.CadastroDeCarroDaF1.Model.CarroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<CarroModel, Long> {
}
