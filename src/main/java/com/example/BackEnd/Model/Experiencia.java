package com.example.BackEnd.Model;

import jakarta.persistence.*;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column
    private String titulo;
    @Column
    private String descripcion;
}
