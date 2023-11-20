package com.example.foyerhamzajomni.DAO.Entitie;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)

@Table(name="Reservation")
public class Reservation {
    @Id
     String idReservation;
     Date anneUniversitaire;
     boolean estValide;

    @ManyToMany(mappedBy = "reservations", cascade = CascadeType.ALL)
    List<Etudiant>etudiants = new ArrayList<>();
}
