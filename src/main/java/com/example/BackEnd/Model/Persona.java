package com.example.BackEnd.Model;

import jakarta.persistence.*;

@Entity
public class Persona {
    @Id@GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    @Column
    String nombre;
    @Column
    String ciudad;
    @Column
    String info;
    @Column
    String sobreMi;
}
