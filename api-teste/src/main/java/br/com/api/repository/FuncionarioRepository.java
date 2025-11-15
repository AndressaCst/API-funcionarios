package br.com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.api.model.funcionarios;

public interface FuncionarioRepository extends JpaRepository<funcionarios, Long> {

}
