package com.example.utickets.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.utickets.servicios.UnidadService;
import com.example.utickets.entidades.Unidad;

@RestController
@RequestMapping("/api/unidades")
public class UnidadController {
    private final UnidadService unidadService;

    @Autowired
    public UnidadController(UnidadService unidadService) {
        this.unidadService = unidadService;
    }

    @GetMapping("/{id}")
    public Unidad getUnidad(@PathVariable Long id) {
        return unidadService.findUnidadById(id);
    }

}

