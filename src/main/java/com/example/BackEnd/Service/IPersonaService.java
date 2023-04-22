package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Persona;

import java.util.List;

public interface IPersonaService {
    void crear(Persona per);
    Persona traer();
    void eliminar(long id);
}
