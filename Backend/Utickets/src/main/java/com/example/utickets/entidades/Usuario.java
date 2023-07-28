package com.example.utickets.entidades;
import javax.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String email;

    private String contrasena;

    private String rut;

    private int anoNacimiento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonManagedReference
    private Unidad unidad;

    //@OneToMany(mappedBy = "usuario")
    //private List<Ticket> tickets;

    // Getters and setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contrasena = contraseña;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.anoNacimiento = añoNacimiento;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    //public void setTickets(List<Ticket> tickets) {
    //    this.tickets = tickets;
    //}

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contrasena;
    }

    public String getRut() {
        return rut;
    }

    public int getAñoNacimiento() {
        return anoNacimiento;
    }

    public Unidad getUnidad() {
        return unidad;
    }

}
