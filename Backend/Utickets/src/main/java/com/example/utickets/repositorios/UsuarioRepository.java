package com.example.utickets.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.utickets.entidades.Usuario;
import java.util.Optional;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);

}

