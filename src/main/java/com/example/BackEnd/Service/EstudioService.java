package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Estudio;
import com.example.BackEnd.Repository.EstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudioService implements IEstudioService{
    @Autowired
    EstudioRepository repo;
    @Override
    public void crear(Estudio e) {
        repo.save(e);
    }

    @Override
    public List<Estudio> traer() {
        return repo.findAll();
    }

    @Override
    public void eliminar(long id) {
        repo.deleteById(id);
    }
}
