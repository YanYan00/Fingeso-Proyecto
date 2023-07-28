package com.example.utickets.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.utickets.repositorios.TicketRepository;
import com.example.utickets.entidades.Ticket;
import java.util.List;


@Service
public class TicketService {
    private final TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
    public List<Ticket> getTicketsByUsuarioId(Long usuarioId) {
        return ticketRepository.findByUsuarioId(usuarioId);
    }


    public Ticket findTicketById(Long id) {
        return ticketRepository.findById(id).orElse(null);
    }

    // Aquí puedes agregar más métodos para interactuar con la base de datos...
}

