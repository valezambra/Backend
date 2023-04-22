package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Estudio;

import java.util.ArrayList;
import java.util.List;

public interface IEstudioService {
    void crear(Estudio e);
    List<Estudio> traer();
    void eliminar(long id);
}
