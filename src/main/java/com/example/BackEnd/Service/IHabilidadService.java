package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Habilidad;

import java.util.ArrayList;

public interface IHabilidadService {
    void crear(Habilidad hab);
    ArrayList<Habilidad> traer();
    void eliminar(long id);
}
