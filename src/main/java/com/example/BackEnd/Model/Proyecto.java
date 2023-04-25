package com.example.BackEnd.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
}
