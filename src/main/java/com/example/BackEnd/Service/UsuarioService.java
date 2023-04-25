package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Usuario;
import com.example.BackEnd.Repository.UsuarioRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    private UsuarioRepository repo;
    @Override
    public void crearUsuario(Usuario u) {
        repo.save(u);
    }

    @Override
    public List<Usuario> traerUsuarios() {
        return repo.findAll();
    }
}
