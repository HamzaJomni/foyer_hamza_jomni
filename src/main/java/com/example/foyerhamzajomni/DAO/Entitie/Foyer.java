package com.example.foyerhamzajomni.DAO.Entitie;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Foyer")
public class Foyer {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
}