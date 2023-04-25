package com.example.BackEnd.Model;

import jakarta.persistence.*;

@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column
    private String nombre_hab;
    @Column
    private String porcentaje;
}
