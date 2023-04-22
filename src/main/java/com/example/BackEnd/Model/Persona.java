package com.example.BackEnd.Model;

import jakarta.persistence.*;

@Entity
public class Persona {
    @Id@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column
    private String nombre;
    @Column
    private String ciudad;
    @Column
    private String info;
    @Column
    private String sobreMi;
}
