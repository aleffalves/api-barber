package com.github.aleffalves.apibarber.repository;

import com.github.aleffalves.apibarber.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByEmail(String email);

//    @Query("SELECT e FROM usuario e JOIN FETCH e.roles WHERE e.email = (:email)")
//    public Usuario findByEmail(@Param("email") String email);
//
//    boolean existsByEmail(String email);
}
