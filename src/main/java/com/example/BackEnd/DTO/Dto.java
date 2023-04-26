package com.example.BackEnd.DTO;

import com.example.BackEnd.Model.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter@Setter@NoArgsConstructor
public class Dto {
    private Persona per;
    private List<Estudio> estudios;
    private List<Habilidad> habilidades;
    private List<Experiencia> experiencias;
}
