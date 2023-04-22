package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Proyecto;
import com.example.BackEnd.Repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    private ProyectoRepository repo;
    @Override
    public void crear(Proyecto proy) {
        repo.save(proy);
    }

    @Override
    public List<Proyecto> traer() {
        return repo.findAll();
    }

    @Override
    public void eliminar(long id) {
        repo.deleteById(id);
    }
}
