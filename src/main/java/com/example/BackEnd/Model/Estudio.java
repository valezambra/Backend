package com.example.BackEnd.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table@Getter@Setter
public class Estudio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column
    private String escuela;
    @Column
    private String titulo;
    @Column
    private String inicio;
    @Column
    private String fin;
}
