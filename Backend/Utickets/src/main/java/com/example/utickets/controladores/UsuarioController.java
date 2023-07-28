package com.example.utickets.controladores;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.utickets.servicios.UsuarioService;
import com.example.utickets.servicios.TicketService;
import com.example.utickets.entidades.Usuario;
import com.example.utickets.entidades.Ticket;
import com.example.utickets.dto.TicketRequest;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        return usuarioService.findUsuarioById(id);
    }

    @Autowired
    private TicketService ticketService;

    @PostMapping("/{usuarioId}/tickets")
    public Ticket createTicketForUser(@PathVariable Long usuarioId, @RequestBody TicketRequest ticketRequest) {
        Usuario usuario = usuarioService.findUsuarioById(usuarioId);
        if (usuario == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado");
        }

        Ticket newTicket = new Ticket();
        newTicket.setDescripcion(ticketRequest.getDescripcion());
        newTicket.setUsuarioId(usuario.getId());
        newTicket.setEstado(true); // abierto
        newTicket.setFechaApertura(new Date()); // fecha actual

        return ticketService.save(newTicket);
    }
    @GetMapping("/{id}/tickets")
    public List<Ticket> getTicketsByUsuarioId(@PathVariable Long id) {
        return ticketService.getTicketsByUsuarioId(id);
    }


}
