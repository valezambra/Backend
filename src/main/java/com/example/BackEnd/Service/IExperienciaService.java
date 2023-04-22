package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Experiencia;

import java.util.List;

public interface IExperienciaService {
    void crear(Experiencia exp);
    List<Experiencia> traer();
    void eliminar(long id);
}
