package com.example.foyerhamzajomni.DAO.Entitie;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="Etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idEtudiant;
     String nomEt;
     String prenomEt;
     long cin;
     String ecole;
     LocalDate dateNaissance;

    @ManyToMany(cascade = CascadeType.ALL)
    List<Reservation>reservations = new ArrayList<>();
}
