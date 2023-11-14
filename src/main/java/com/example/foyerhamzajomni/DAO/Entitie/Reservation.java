package com.example.foyerhamzajomni.DAO.Entitie;

import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

@Entity
@Table(name="Reservation")
public class Reservation {
    @Id
    @Column(name="identifiant")
    private String idReservation;
    private LocalDate anneUniversitaire;
    private boolean estValide;

    public Reservation() {

    }
}
