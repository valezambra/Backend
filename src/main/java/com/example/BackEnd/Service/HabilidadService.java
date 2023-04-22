package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Habilidad;
import com.example.BackEnd.Repository.HabilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabilidadService implements IHabilidadService{
    @Autowired
    private HabilidadRepository repo;
    @Override
    public void crear(Habilidad hab) {
        repo.save(hab);
    }

    @Override
    public List<Habilidad> traer() {
        return repo.findAll();
    }

    @Override
    public void eliminar(long id) {
        repo.deleteById(id);
    }
}
