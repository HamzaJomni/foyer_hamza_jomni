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

@Table(name="Universite")
public class Universite {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idUniversite;
     String nomUniversite;
     String adresse;

    @OneToOne
    Foyer foyer;
}