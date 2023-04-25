package com.example.BackEnd.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table@Getter
@Setter
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column
    private String nombre_hab;
    @Column
    private String porcentaje;
}
