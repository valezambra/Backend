package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Persona;

import java.util.ArrayList;

public interface IPersonaService {
    void crear(Persona per);
    ArrayList<Persona> traer();
    void eliminar();
}
