package com.example.BackEnd.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table@Getter
@Setter
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column
    private String titulo;
    @Column
    private String descripcion;
}
