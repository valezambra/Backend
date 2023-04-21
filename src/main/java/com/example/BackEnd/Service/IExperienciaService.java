package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Experiencia;

import java.util.ArrayList;

public interface IExperienciaService {
    void crear(Experiencia exp);
    ArrayList<Experiencia> traer();
    void eliminar(long id);
}
