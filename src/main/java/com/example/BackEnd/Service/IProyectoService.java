package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Proyecto;

import java.util.ArrayList;

public interface IProyectoService {
    void crear(Proyecto proy);
    ArrayList<Proyecto> traer();
    void eliminar(long id);
}
