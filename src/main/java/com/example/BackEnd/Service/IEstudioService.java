package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Estudio;

import java.util.ArrayList;

public interface IEstudioService {
    void crear(Estudio e);
    ArrayList<Estudio> traer();
    void eliminar(long id);
}
