package com.example.foyerhamzajomni.DAO.Entitie;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Etudiant")
public class Etudiant {
    @Id
    @Column(name="identifiant")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    private LocalDate dateNaissance;
}
