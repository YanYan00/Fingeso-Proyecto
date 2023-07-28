package com.example.utickets.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.utickets.entidades.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
}
