package com.example.utickets.entidades;

import javax.persistence.*;


@Entity
public class Unidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;


}


