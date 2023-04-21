package com.example.BackEnd.DTO;

import com.example.BackEnd.Model.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
@Getter@Setter@NoArgsConstructor
public class Dto {
    private Persona per;
    private ArrayList<Estudio> estudios;
    private ArrayList<Habilidad> habilidades;
    private ArrayList<Proyecto> proyectos;
    private ArrayList<Experiencia> experiencias;
}
