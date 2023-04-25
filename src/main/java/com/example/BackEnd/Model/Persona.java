package com.example.BackEnd.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table@Getter
@Setter
public class Persona {
    @Id@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String mail;
    @Column
    private String numero;
    @Column
    private String ubicacion;
    @Column
    private String info;
    @Column
    private String sobreMi;
    @Column
    private String banner;
    @Column
    private String image_perfil;
}
