package com.example.BackEnd.Repository;

import com.example.BackEnd.Model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository<Estudio,Long> {
}
