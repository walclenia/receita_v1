package br.com.receitasegura.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.receitasegura.api.model.Especialidade;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {

}
