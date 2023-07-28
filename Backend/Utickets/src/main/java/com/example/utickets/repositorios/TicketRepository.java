package com.example.utickets.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.utickets.entidades.Ticket;
import java.util.List;


public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByUsuarioId(Long usuarioId);
}
