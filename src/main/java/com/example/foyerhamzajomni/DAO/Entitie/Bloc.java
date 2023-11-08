package com.example.foyerhamzajomni.DAO.Entitie;

import jakarta.persistence.*;


@Entity
@Table(name="Bloc")
public class Bloc {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;
}