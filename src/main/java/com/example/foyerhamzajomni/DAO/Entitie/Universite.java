package com.example.foyerhamzajomni.DAO.Entitie;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Universite")
public class Universite {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;
    private String nomUniversite;
    private String adresse;
}