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

@Table(name="Foyer")
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idFoyer;
     String nomFoyer;
     long capaciteFoyer;

    @OneToOne(mappedBy = "foyer")
    Universite universite;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foyer")
    List<Bloc> blocs = new ArrayList<>();
}