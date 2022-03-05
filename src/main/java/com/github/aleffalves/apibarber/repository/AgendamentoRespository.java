package com.github.aleffalves.apibarber.repository;

import com.github.aleffalves.apibarber.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRespository extends JpaRepository<Agendamento, Integer> {
}
