package com.example.foyerhamzajomni.DAO.Entitie;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Reservation")
public class Reservation {
    @Id
    @Column(name="identifiant")
    private String idReservation;
    private LocalDate anneUniversitaire;
    private boolean estValide;
}
