package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Experiencia;
import com.example.BackEnd.Repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired
    ExperienciaRepository repo;
    @Override
    public void crear(Experiencia exp) {
        repo.save(exp);
    }

    @Override
    public List<Experiencia> traer() {
        return repo.findAll();
    }

    @Override
    public void eliminar(long id) {

    }
}
