package com.example.BackEnd.Service;

import com.example.BackEnd.Model.Usuario;

import java.util.List;

public interface IUsuarioService {
    void crearUsuario(Usuario u);
    List<Usuario> traerUsuarios();
}
