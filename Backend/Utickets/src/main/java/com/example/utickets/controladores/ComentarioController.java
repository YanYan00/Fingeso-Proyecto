package com.example.utickets.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.utickets.servicios.ComentarioService;
import com.example.utickets.entidades.Comentario;

@RestController
@RequestMapping("/api/comentarios")
public class ComentarioController {
    private final ComentarioService comentarioService;

    @Autowired
    public ComentarioController(ComentarioService comentarioService) {
        this.comentarioService = comentarioService;
    }

    @GetMapping("/{id}")
    public Comentario getComentario(@PathVariable Long id) {
        return comentarioService.findComentarioById(id);
    }

    // Aquí puedes agregar más endpoints...
}
