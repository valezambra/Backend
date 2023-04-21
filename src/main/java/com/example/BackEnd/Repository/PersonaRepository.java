package com.example.BackEnd.Repository;

import com.example.BackEnd.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Long, Persona> {
}
