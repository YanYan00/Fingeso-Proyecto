package com.example.utickets.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.utickets.repositorios.UnidadRepository;
import com.example.utickets.entidades.Unidad;

@Service
public class UnidadService {
    private final UnidadRepository unidadRepository;

    @Autowired
    public UnidadService(UnidadRepository unidadRepository) {
        this.unidadRepository = unidadRepository;
    }

    public Unidad findUnidadById(Long id) {
        return unidadRepository.findById(id).orElse(null);
    }

    // Aquí puedes agregar más métodos para interactuar con la base de datos...
}
