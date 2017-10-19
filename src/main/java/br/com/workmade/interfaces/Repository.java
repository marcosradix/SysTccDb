package br.com.workmade.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.workmade.model.CadastrarTccModel;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<CadastrarTccModel, Long>{

}
