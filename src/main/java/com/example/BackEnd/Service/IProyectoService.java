package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Proyecto;

import java.util.List;

public interface IProyectoService {
    void crear(Proyecto proy);
    List<Proyecto> traer();
    void eliminar(long id);
}
