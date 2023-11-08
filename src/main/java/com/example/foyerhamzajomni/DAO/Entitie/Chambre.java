package com.example.foyerhamzajomni.DAO.Entitie;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Chambre")
public class Chambre {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private long numchambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;
}
