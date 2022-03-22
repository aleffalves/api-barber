package com.github.aleffalves.apibarber.repository;

import com.github.aleffalves.apibarber.model.Horarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorariosRepository extends JpaRepository<Horarios,Integer> {
}
