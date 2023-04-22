package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Persona;
import com.example.BackEnd.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{
    @Autowired
    PersonaRepository repo;

    @Override
    public void crear(Persona per) {
        repo.save(per);
    }

    @Override
    public Persona traer() {
        return repo.findById(1L).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        repo.deleteById(id);
    }
}
