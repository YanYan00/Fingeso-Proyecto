package com.example.utickets.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.utickets.repositorios.ComentarioRepository;
import com.example.utickets.entidades.Comentario;

@Service
public class ComentarioService {
    private final ComentarioRepository comentarioRepository;

    @Autowired
    public ComentarioService(ComentarioRepository comentarioRepository) {
        this.comentarioRepository = comentarioRepository;
    }

    public Comentario findComentarioById(Long id) {
        return comentarioRepository.findById(id).orElse(null);
    }

    // Aquí puedes agregar más métodos para interactuar con la base de datos...
}

