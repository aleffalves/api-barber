package com.github.aleffalves.apibarber.repository;

import com.github.aleffalves.apibarber.model.Servicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicosRepository extends JpaRepository<Servicos,Integer> {
}
