package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Habilidad;

import java.util.List;

public interface IHabilidadService {
    void crear(Habilidad hab);
    List<Habilidad> traer();
    void eliminar(long id);
}
